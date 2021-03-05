package com.example.workshopspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshopspring.entities.User;
import com.example.workshopspring.repositories.UserRepository;
import com.example.workshopspring.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repositoty;
	
	public List <User> findAll(){
		return repositoty.findAll();
	}
	
	public User findById(Long id) {
	Optional<User> obj = repositoty.findById(id);
	return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repositoty.save(obj);
	}
	
	public void delete(Long id) {
		repositoty.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repositoty.getOne(id);
		updateData(entity, obj);
		return repositoty.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
