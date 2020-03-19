package com.projeto.auditeestoque.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "mobile")
public class Mobile {
	
	@Version
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private String nameUser;
	
	@Column
	private String nameMobile;
	
	@Column(name="mac", unique=true, nullable=false)
	private String mac; 
	
	@Column(name = "token", unique=true, nullable=false)
	private String token;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getnameUser() {
		return nameUser;
	}

	public void setnameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getNameMobile() {
		return nameMobile;
	}

	public void setNameMobile(String nameMobile) {
		this.nameMobile = nameMobile;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String tocken) {
		this.token = tocken;
	}
	

}
