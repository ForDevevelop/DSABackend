package com.example.demo.mongoModel;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="navbar")
public class Catagories {
	
	@Id
	private ObjectId _id;
	private String cat;
	
	public ObjectId getId() {
		return _id;
	}
	public void setId(ObjectId id) {
		this._id = id;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	
}
