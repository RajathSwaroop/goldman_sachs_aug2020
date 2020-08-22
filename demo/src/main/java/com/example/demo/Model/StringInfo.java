package com.example.demo.Model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StringInfo {
	@Id
	private String id;
	private String string;
	
	public StringInfo() {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "StringInfo [id=" + id + ", string=" + string + "]";
	}
	
	
}
