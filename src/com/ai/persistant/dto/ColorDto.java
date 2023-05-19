package com.ai.persistant.dto;

import java.io.Serializable;

public class ColorDto implements Serializable{
	
	private int id;
	private String name;
	private String code;
	
	public ColorDto() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	

}
