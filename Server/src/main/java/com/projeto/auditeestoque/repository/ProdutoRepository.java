package com.projeto.auditeestoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.auditeestoque.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
