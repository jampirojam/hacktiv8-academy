package id.jampirojam.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import id.jampirojam.springboot.model.Product;

public interface ProductService {
	List<Product> getAllProducts();
	void saveProduct(Product product);
	Product getProductById(long id);
	void deleteProductById(long id);
	Page<Product> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
	
	// api
	List<Product> findAllApi();
	Product findApiById(Long id);
	Product saveApi(Product product);
	void deleteApiById(Long id);
	void deleteApi(Long id);
}
