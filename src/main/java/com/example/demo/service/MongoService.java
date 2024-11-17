package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MongoRepo;



@Service
public class MongoService {
	
	@Autowired
	private MongoRepo mongoRepo;
	
	public void fetch() {
		mongoRepo.findAll();
		System.out.println(mongoRepo.findAll());
		
	}

}
