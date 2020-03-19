package com.projeto.auditeestoque.entity;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.Version;

@Entity
public class Produto {
	
	@Version
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;

	@Column(unique = true, nullable = false, length = 32)
	private int codigo = new Random().nextInt(9999);

	@Column(unique = true, nullable = false, length = 32)
	private String codigoBarras;

	@Column
	private String name;
	
	@Column
	private String tipoEmbalagem; 
		
	@Column(name = "qtdEmbConversao")
	private int qtdEmbConversao;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTipoEmbalagem() {
		return tipoEmbalagem;
	}

	public void setTipoEmbalagem(String tipoEmbalagem) {
		this.tipoEmbalagem = searchTipe(tipoEmbalagem);
	}
	
	public String searchTipe(String str) {
		switch (str) {
			case "CXA":
				return str;
			case "FRD":
			 	return str;
			case "UND":
			 	return str;
			default:
				return "UND";
		}
	}

	public int getqtdEmbConversao() {
		return qtdEmbConversao;
	}
	
}
