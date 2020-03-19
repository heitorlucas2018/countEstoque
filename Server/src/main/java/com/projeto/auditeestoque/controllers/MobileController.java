package com.projeto.auditeestoque.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.auditeestoque.entity.Mobile;
import com.projeto.auditeestoque.helpers.RequestInterface;
import com.projeto.auditeestoque.model.Mobiles;
import com.projeto.auditeestoque.repository.MobileRepository;

@RestController
@RequestMapping(value = {"/mobile/","/mobile"})
public class MobileController extends Mobiles implements RequestInterface<Mobile> {

	public MobileController(MobileRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Mobile create(Mobile e) {
		// TODO Auto-generated method stub
		return Save(e);
	}

	@Override
	public Mobile update(Mobile e) {
		// TODO Auto-generated method stub
		return Save(e);
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		return Delete(id);
	}

	@Override
	public List<Mobile> showList() {
		// TODO Auto-generated method stub
		return ListAll();
	}

	@Override
	public Mobile showList(int id) {
		// TODO Auto-generated method stub
		return searchById(id);
	}

}
