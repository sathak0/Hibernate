package com.yousuf.demo1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Data {
	@Id
	private int id;
	private String Name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	

}
