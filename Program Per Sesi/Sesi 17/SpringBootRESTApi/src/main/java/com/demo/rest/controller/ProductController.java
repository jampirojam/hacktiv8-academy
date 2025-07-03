package com.demo.rest.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.demo.rest.entity.Product;
import com.demo.rest.repository.ProductRepository;
import com.demo.rest.service.ProductService;

@CrossOrigin(origins = "http://localhost:8809")
@RestController
@RequestMapping("/q")
public class ProductController {


	@Autowired
	private ProductRepository prodRepository;

	@Autowired
	private ProductService prodService;

	@GetMapping("/prodtes")
	public List<Product> findAllProducts() {
		return prodRepository.findAll();
	}

	@PostMapping("/prodtes")
	public Product saveProducts(@RequestBody Product product) {
		return prodService.saveProduct(product);
	}

	@GetMapping("/prodtes/id/{id}")
	public Product findProductById(@PathVariable Long id) {
		return prodService.findProductById(id);
	}
	
	@DeleteMapping("/prodtes/id/{id}")
	public void deleteById(@PathVariable Long id) {
		prodService.deleteProductById(id);
	}

	@CrossOrigin
	@PutMapping("/prodtes")
	public ResponseEntity<?> updateProductById(@RequestBody Product product, @RequestParam Long id) {

		try {
			Product checkProduct = prodService.findProductById(id);
			if (checkProduct.getId() != id) {
				return new ResponseEntity<>("ID Data Produk Belum Sesuai", HttpStatus.OK);
			}
			product.setId(id);
			prodService.saveProduct(product);


			return new ResponseEntity<>("Berhasil simpan prod", HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("Terjadi kesalahan" + e.getMessage(), HttpStatus.OK);
		}
	}

}