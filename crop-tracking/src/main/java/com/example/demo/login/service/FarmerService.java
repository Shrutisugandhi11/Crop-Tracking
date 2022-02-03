package com.example.demo.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.login.domain.Farmer;
import com.example.demo.login.repository.FarmerRepository;

@Service
public class FarmerService {
	
	@Autowired
	private FarmerRepository repo;
	
	
	public Farmer login(String farmername,String password) {
		Farmer farmer=repo.findByFarmernameAndPassword(farmername,password);
		return farmer;
	}

}
