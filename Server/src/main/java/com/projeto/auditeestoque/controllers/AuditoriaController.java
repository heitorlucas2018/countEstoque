package com.projeto.auditeestoque.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.auditeestoque.entity.Auditoria;
import com.projeto.auditeestoque.helpers.RequestInterface;
import com.projeto.auditeestoque.model.Auditar;
import com.projeto.auditeestoque.repository.AuditoriaRepository;

@RestController
@RequestMapping(value = {"/auditoria/","/auditoria"})
public class AuditoriaController extends Auditar implements RequestInterface<Auditoria> {

	public AuditoriaController(AuditoriaRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Auditoria create(Auditoria e) {
		// TODO Auto-generated method stub
		return register(e);
	}
	
	@Override
	public Auditoria update(Auditoria e) {
		// TODO Auto-generated method stub
		return Update(e);
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		return delete(id);
	}

	@Override
	public List<Auditoria> showList() {
		// TODO Auto-generated method stub
		return listAll();
	}

	@Override
	public Auditoria showList(int id) {
		// TODO Auto-generated method stub
		return findUserById(id);
	}

}
