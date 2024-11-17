package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;




@SpringBootApplication
@EnableMongoRepositories
public class DsaApplication  {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);
	}

}
