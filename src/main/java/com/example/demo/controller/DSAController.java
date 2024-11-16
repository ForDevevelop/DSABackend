package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping()
public class DSAController {
	
	 @Operation(
	            summary = "Fetch all plants",
	            description = "fetches all plant entities and their data from data source")
	    @ApiResponses(value = {
	            @ApiResponse(responseCode = "200", description = "successful operation")
	    })
	    @GetMapping(value = "/all", produces = "application/json")
	public String home() {
		
		return "Home";
	}

}
