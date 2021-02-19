package com.example.workshopspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshopspring.entities.Product;
import com.example.workshopspring.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repositoty;
	
	public List <Product> findAll(){
		return repositoty.findAll();
	}
	
	public Product findById(Long id) {
	Optional<Product> obj = repositoty.findById(id);
	return obj.get();
	}
	
}
