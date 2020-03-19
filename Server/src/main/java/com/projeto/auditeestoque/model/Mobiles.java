package com.projeto.auditeestoque.model;

import java.util.List;

import com.projeto.auditeestoque.entity.Mobile;
import com.projeto.auditeestoque.repository.MobileRepository;

public class Mobiles {

	private MobileRepository repository;
	
	public Mobiles(MobileRepository repository) {
		// TODO Auto-generated constructor stub
		this.repository = repository;
	}
		
	public Mobile Save(Mobile m) {
		try {
			return repository.save(m);
		} catch (Exception e) {
			String msg = "ERROR::UCCR30::";
			   msg.concat(e.getMessage());
			   msg.concat(e.getLocalizedMessage());
			System.out.println(msg);
			return null;
		}
	}
	
	public List<Mobile> Save(List<Mobile> m) {
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

	public List<Mobile> ListAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	} 
	
	public Mobile searchById(int id) {
		// TODO Auto-generated method stub
		
		return repository.findById(id).get();
	}

}
