package com.projeto.auditeestoque.helpers;

import java.util.List;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


public interface RequestInterface<E> {

	@PostMapping("/{key}")
	public E create(@RequestBody E e);
	//public List<E> create(@RequestBody List<E> e);
	
	@PutMapping("/{key}")
	public E update(@RequestBody E e);
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id);
	
	@GetMapping(value = {"","/","/show"})
	public List<E> showList();

	@GetMapping(value = {"/{id}","/show/{id}"})
	public E showList(@PathVariable int id);
	
}
