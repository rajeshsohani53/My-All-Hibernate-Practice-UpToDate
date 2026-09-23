package com.rajesh.Entity;

import java.time.LocalDate;

public class Bookings {
	private Integer bookingId;
	private LocalDate bookingDate;
	private Integer seats;
	private Double totalAmount;
	private Customer customer;
	private Movies movies;
	
	
	
	public Bookings(Integer bookingId, LocalDate bookingDate, Integer seats, Double totalAmount, Customer customer,
			Movies movies) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.seats = seats;
		this.totalAmount = totalAmount;
		this.customer = customer;
		this.movies = movies;
	}
	public Bookings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Integer getSeats() {
		return seats;
	}
	public void setSeats(Integer seats) {
		this.seats = seats;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	public Movies getMovies() {
		return movies;
	}
	public void setMovies(Movies movies) {
		this.movies = movies;
	}
	@Override
	public String toString() {
		return "Bookings [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", seats=" + seats
				+ ", totalAmount=" + totalAmount + "]";
	}
	
	
	
}
