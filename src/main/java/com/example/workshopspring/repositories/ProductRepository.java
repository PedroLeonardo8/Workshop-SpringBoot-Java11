package com.example.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workshopspring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
