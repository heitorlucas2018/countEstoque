package com.projeto.auditeestoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.auditeestoque.entity.AuditoriaProdutos;

public interface AuditoriaProdutosRepository extends JpaRepository<AuditoriaProdutos, Integer> {

}
