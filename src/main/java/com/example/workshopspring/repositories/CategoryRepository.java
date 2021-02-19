package com.example.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workshopspring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
