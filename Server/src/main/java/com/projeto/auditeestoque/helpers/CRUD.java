package com.projeto.auditeestoque.helpers;

import java.util.List;

public interface CRUD<E,R> {
	
	public E create(E e);
		
	public E update(E e);
	
	public E delete(E e);
	
	public E show(E e);
	
	public List<E> showAll(E e);
	
	
}
