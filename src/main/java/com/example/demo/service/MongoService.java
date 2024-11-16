package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.MongoRepository.NavRepo;
import com.example.demo.mongoModel.Catagories;


@Service
public class MongoService {

	@Autowired
	  NavRepo rep;
	
	public List<String> name() {
		return rep.findAll().stream().map(n->n.getCat()).toList();
	}
}
