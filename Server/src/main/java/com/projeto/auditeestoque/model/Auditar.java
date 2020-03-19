package com.projeto.auditeestoque.model;

import java.util.List;

import com.projeto.auditeestoque.entity.Auditoria;
import com.projeto.auditeestoque.entity.AuditoriaProdutos;
import com.projeto.auditeestoque.repository.AuditoriaRepository;

public class Auditar {

	private AuditoriaRepository repository;
	
	public Auditar(AuditoriaRepository repository) {
		this.repository = repository;
	}
		
	public Auditoria register(Auditoria e) {
		try {
			return repository.save(e);
		} catch (Exception ex) {
			String msg = "ERROR::UCCR30::";
			       msg = msg.concat(ex.getMessage());
			System.out.println(msg);
			return null;
		}
	}
	
	public Auditoria Update(Auditoria e) {
		try {
			repository.update(e.getStatus(), e.getId());
			return null;
		} catch (Exception ex) {
			String msg = "ERROR::UCCR30::";
			       msg = msg.concat(ex.getMessage());
			System.out.println(msg);
			return null;
		}
	}
	
	
	public String delete(int id) {
		if(!repository.existsById(id))
			return "Not Exists.";
		try {
			repository.deleteById(id);
			return "true";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public List<Auditoria> listAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	} 
	
	public Auditoria findUserById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}
	
}
