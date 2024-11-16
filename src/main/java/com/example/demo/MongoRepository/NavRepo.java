package com.example.demo.MongoRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.mongoModel.Catagories;

@Repository
public interface NavRepo extends MongoRepository<Catagories, Integer>{

}
