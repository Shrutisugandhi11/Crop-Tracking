package com.example.demo.login.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Farmer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String farmername;
	private String password;
	public Farmer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	public Farmer(Long id, String farmername, String password) {
		super();
		this.id = id;
		this.farmername = farmername;
		this.password = password;
	}




	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getFarmername() {
		return farmername;
	}

	public void setFarmername(String farmername) {
		this.farmername = farmername;
	}
	
	
	
}
