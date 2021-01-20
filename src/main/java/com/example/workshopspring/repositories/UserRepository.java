package com.example.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workshopspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
