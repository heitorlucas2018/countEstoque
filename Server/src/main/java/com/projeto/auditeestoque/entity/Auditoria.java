package com.projeto.auditeestoque.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Auditoria {
	
	@Version
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private String name;
	
	@Column(columnDefinition = "varchar(1) default 'A'")
	private String status = "A";
	
	@Column(columnDefinition = "DATETIME")
	private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	
	@ElementCollection
	@CollectionTable(name = "auditoriaProdutoLink",joinColumns = @JoinColumn(name = "idAuditoria"))
	@OneToMany(cascade = { CascadeType.ALL })
	private List<AuditoriaProdutos> produtos;
	
	public List<AuditoriaProdutos> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<AuditoriaProdutos> produtos) {
		this.produtos = produtos;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public String getStatus() {
		return status;
	}

	public void setStatus() {
		this.status = "A";
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
}
