package com.rajesh.Entity;

public class Job {
  private Integer id;
  private String name;
  private String role;
  private String skills;
  private Double salary;
  public Job() {
	super();
	// TODO Auto-generated constructor stub
  }
  public Job(Integer id, String name, String role, String skills, Double salary) {
	super();
	this.id = id;
	this.name = name;
	this.role = role;
	this.skills = skills;
	this.salary = salary;
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
  public String getRole() {
	return role;
  }
  public void setRole(String role) {
	this.role = role;
  }
  public String getSkills() {
	return skills;
  }
  public void setSkills(String skills) {
	this.skills = skills;
  }
  public Double getSalary() {
	return salary;
  }
  public void setSalary(Double salary) {
	this.salary = salary;
  }
  @Override
  public String toString() {
	return "Job [id=" + id + ", name=" + name + ", role=" + role + ", skills=" + skills + ", salary=" + salary + "]";
  }
  
  
  
  
}
