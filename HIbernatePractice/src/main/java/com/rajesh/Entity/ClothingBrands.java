package com.rajesh.Entity;

public class ClothingBrands {
	private Integer id;
	private String name;
	private String type;
	private Integer rate;
	public ClothingBrands() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClothingBrands(Integer id, String name, String type, Integer rate) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.rate = rate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "ClothingBrands [id=" + id + ", name=" + name + ", type=" + type + ", rate=" + rate + "]";
	}
	
  
}
