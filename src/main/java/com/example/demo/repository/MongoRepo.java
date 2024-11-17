package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.example.demo.model.Grocery;

public interface MongoRepo extends MongoRepository<Grocery, String> {
		
		
	}


