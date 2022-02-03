package com.example.demo.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.login.domain.Farmer;

@Repository
public interface FarmerRepository extends JpaRepository<Farmer, Long> {
	Farmer findByFarmernameAndPassword(String farmername,String password);

}
