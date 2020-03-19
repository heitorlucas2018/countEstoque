package com.projeto.auditeestoque.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.auditeestoque.entity.Produto;
import com.projeto.auditeestoque.helpers.RequestInterface;
import com.projeto.auditeestoque.model.Produtos;
import com.projeto.auditeestoque.repository.ProdutoRepository;

@RestController
@RequestMapping(value = {"/produto/","/produto"})
public class ProdutoController extends Produtos implements RequestInterface<Produto> {

	public ProdutoController(ProdutoRepository repository) {
		super(repository);
	}
		
	@Override
	public Produto create(Produto e) {
		// TODO Auto-generated method stub
		return Save(e);
	}
	
	@PostMapping("/addlist/{key}")
	public List<Produto> listOfCreate(@RequestBody List<Produto> e){
		return Save(e);
	};

	@Override
	public Produto update(Produto e) {
		// TODO Auto-generated method stub
		return Save(e);
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		return Delete(id);
	}

	@Override
	public List<Produto> showList() {
		// TODO Auto-generated method stub
		return ListAll();
	}

	@Override
	public Produto showList(int id) {
		// TODO Auto-generated method stub
		return findUserById(id);
	}

}
