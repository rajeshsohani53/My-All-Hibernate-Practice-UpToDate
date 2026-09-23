package com.rajesh.Entity;

import java.util.List;

public class Customer {
private Integer customerId;
private String customerName;
private String customerEmail;
private String customerCity;
private List<Bookings> bookings;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(Integer customerId, String customerName, String customerEmail, String customerCity,
		List<Bookings> bookings) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerEmail = customerEmail;
	this.customerCity = customerCity;
	this.bookings = bookings;
}
public Integer getCustomerId() {
	return customerId;
}
public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
public String getCustomerCity() {
	return customerCity;
}
public void setCustomerCity(String customerCity) {
	this.customerCity = customerCity;
}
public List<Bookings> getBookings() {
	return bookings;
}
public void setBookings(List<Bookings> bookings) {
	this.bookings = bookings;
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail=" + customerEmail
			+ ", customerCity=" + customerCity + "]";
}


}
