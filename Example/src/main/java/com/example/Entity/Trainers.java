package com.example.Entity;

public class Trainers {
     private Integer id;
     private String name;
     private Integer salary;
     private Integer exp;
     private String subjects;
	 public Trainers() {
		super();
		// TODO Auto-generated constructor stub
	 }
	 public Trainers(Integer id, String name, Integer salary, Integer exp, String subjects) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.exp = exp;
		this.subjects = subjects;
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
	 public Integer getSalary() {
		 return salary;
	 }
	 public void setSalary(Integer salary) {
		 this.salary = salary;
	 }
	 public Integer getExp() {
		 return exp;
	 }
	 public void setExp(Integer exp) {
		 this.exp = exp;
	 }
	 public String getSubjects() {
		 return subjects;
	 }
	 public void setSubjects(String subjects) {
		 this.subjects = subjects;
	 }
	 @Override
	 public String toString() {
		return "Trainers [id=" + id + ", name=" + name + ", salary=" + salary + ", exp=" + exp + ", subjects="
				+ subjects + "]";
	 }
     
}
