package com.example.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workshopspring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
