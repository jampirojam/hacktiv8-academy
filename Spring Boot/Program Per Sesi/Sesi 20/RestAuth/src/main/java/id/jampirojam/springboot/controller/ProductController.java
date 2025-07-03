package id.jampirojam.springboot.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import id.jampirojam.springboot.repository.ProductRepository;

import id.jampirojam.springboot.model.Product;
import id.jampirojam.springboot.service.ProductService;

@CrossOrigin(origins = "http://localhost:8765")
@RestController
// @ Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/main")
	public String viewHomePage(Model model) {
		return findPaginated(1, "nama", "asc", model);		
	}
	
	@GetMapping("/showNewProductForm")
	public String showNewProductForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "new_product";
	}
	
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product") Product product) {
		productService.saveProduct(product);
		return "redirect:/main";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		
		Product product = productService.getProductById(id);
		
		model.addAttribute("product", product);
		return "update_product";
	}
	
	@GetMapping("/deleteProduct/{id}")
	public String deleteEmployee(@PathVariable (value = "id") long id) {
		
		this.productService.deleteProductById(id);
		return "redirect:/main";
	}
	
	@GetMapping("main/{pageNo}")
	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		int pageSize = 5;
		
		Page<Product> page = productService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Product> listEmployees = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		
		model.addAttribute("listProducts", listEmployees);
		return "main";
	}
	
	// api test
	
	@GetMapping("api/prodtes")
	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}
	
	@PostMapping("api/prodtes")
	public Product saveProducts(@RequestBody Product product) {
		return productService.saveApi(product);
	}

	@GetMapping("api/prodtes/id/{id}")
	public Product findProductById(@PathVariable Long id) {
		return productService.findApiById(id);
	}
	
	@DeleteMapping("api/prodtes/id/{id}")
	public void deleteById(@PathVariable Long id) {
		productService.deleteApiById(id);
	}

	@CrossOrigin
	@PutMapping("api/prodtes")
	public ResponseEntity<?> updateProductById(@RequestBody Product product, @RequestParam Long id) {

		try {
			Product checkProduct = productService.findApiById(id);
			if (checkProduct.getId() != id) {
				return new ResponseEntity<>("ID Data Produk Belum Sesuai", HttpStatus.OK);
			}
			product.setId(id);
			productService.saveApi(product);


			return new ResponseEntity<>("Berhasil simpan prod", HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("Terjadi kesalahan" + e.getMessage(), HttpStatus.OK);
		}
	}
	
}
