package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class Grocery {

	@Id
	private String id;

	private String name;
	private int quantity;
	private String category;
	
	public Grocery(String id, String name, int quantity, String category) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.category = category;
	}
}
