package com.example.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workshopspring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
