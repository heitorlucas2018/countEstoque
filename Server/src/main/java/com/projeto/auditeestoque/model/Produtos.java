package com.projeto.auditeestoque.model;

import java.util.List;

import com.projeto.auditeestoque.entity.Produto;
import com.projeto.auditeestoque.repository.ProdutoRepository;

public class Produtos {

	private ProdutoRepository repository;
	
	public Produtos(ProdutoRepository repository) {
		// TODO Auto-generated constructor stub
		this.repository = repository;
	}
		
	public Produto Save(Produto m) {
		try {
			//return repository.save(m);
			return repository.save(m);
		} catch (Exception e) {
			String msg = "ERROR::UCCR30::";
			   msg.concat(e.getMessage());
			   msg.concat(e.getLocalizedMessage());
			System.out.println(msg);
			return null;
		}
	}

	public List<Produto> Save(List<Produto> m) {
		try {
			return repository.saveAll(m);
		} catch (Exception e) {
			String msg = "ERROR::UCCR30::";
			   msg.concat(e.getMessage());
			   msg.concat(e.getLocalizedMessage());
			System.out.println(msg);
			return null;
		}
	}
		
	public String Delete(int id) {
		if(!repository.existsById(id))
			return "Not Exists.";
		try {
			repository.deleteById(id);
			return "true";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public List<Produto> ListAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	} 
	
	public Produto findUserById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

}
