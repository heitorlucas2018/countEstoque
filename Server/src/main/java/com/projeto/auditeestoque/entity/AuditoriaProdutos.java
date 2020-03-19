package com.projeto.auditeestoque.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "auditoriaProdutos")
public class AuditoriaProdutos {
	
	@Version
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	@OneToOne(cascade = {CascadeType.MERGE})
	@JoinTable(name = "produtoAuditoriaProdutoLink", 
    joinColumns = 
      {@JoinColumn(name = "idAuditoriaProduto", referencedColumnName = "id") },
    inverseJoinColumns = 
      { @JoinColumn(name = "idProduto", referencedColumnName = "id") })
	private Produto produto;

	@Column(nullable = true)
	private int idMobile;
	
	@Column(columnDefinition = "INTEGER (10) NOT NULL DEFAULT (0)")
	private int quantidade = 0;
	
	@Column(columnDefinition = "DATETIME")
	private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public int getIdMobile() {
		return idMobile;
	}

	public void setIdMobile(int idMobile) {
		this.idMobile = idMobile;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
		
}
