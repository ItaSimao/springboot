package com.projetogabriel.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetogabriel.userdept.entities.Pessoa;
import com.projetogabriel.userdept.reoisitories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserRepository repository; 
	
	@GetMapping
	public List<Pessoa> findAll(){
		List <Pessoa> result = repository.findAll();
		return result;
}

	@GetMapping(value = "/{id}")
	public Pessoa findById(@PathVariable Long id){
		Pessoa result = repository.findById(id).get();
		return result;
	
}
	
	@PostMapping 
	public Pessoa insert(@RequestBody Pessoa pessoa){
		Pessoa result = repository.save(pessoa);
		return result;
	
}
}
