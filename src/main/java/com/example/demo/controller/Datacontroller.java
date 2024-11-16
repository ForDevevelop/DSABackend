package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mongoModel.Catagories;
import com.example.demo.service.MongoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/data")
public class Datacontroller {
	
	@Autowired
	private MongoService mongoService;
	
	
	@Operation(
            summary = "Fetch all Concepts",
            description = "fetches all the concepts for to display in the UI")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
	@GetMapping("/concepts")
	public List<String> returnConcepts(){
		
		return mongoService.name();
	}

}