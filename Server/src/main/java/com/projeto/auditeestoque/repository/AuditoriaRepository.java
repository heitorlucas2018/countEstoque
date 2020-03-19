package com.projeto.auditeestoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.auditeestoque.entity.Auditoria;

public interface AuditoriaRepository extends JpaRepository<Auditoria, Integer> {
	
	@Transactional
	@Modifying
	@Query(value = "update auditoria set status = :status where id = :id", nativeQuery = true)
	int update(@Param("status") String status, @Param("id") int id);
}
