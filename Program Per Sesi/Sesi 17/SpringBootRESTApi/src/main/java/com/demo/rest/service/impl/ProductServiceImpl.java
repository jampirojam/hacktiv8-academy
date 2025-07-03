package com.demo.rest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.rest.entity.Product;
import com.demo.rest.repository.ProductRepository;
import com.demo.rest.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productsRepository;

	@Override
	public List<Product> findAllProducts() {
		return productsRepository.findAll();
	}
	
    @Override
    public List <Product> getAllProducts() {
        return productsRepository.findAll();
    }

	@Override
	public List<Product> findAllProductsByName(String name) {
		return productsRepository.findAllByName(name);
	}

	@Override
	public Product findProductById(Long id) {
		Optional <Product> optional = productsRepository.findById(id);
        Product product = null;
        if (optional.isPresent()) {
            product = optional.get();
        } else {
            throw new RuntimeException("Product not found for id :: " + id);
        }
        return product;
	}
	

	@Override
	public Product saveProduct(Product product) {
		return productsRepository.save(product);
	}

	@Override
	public void deleteProductById(Long id) {
		productsRepository.deleteById(id);

	}

}
