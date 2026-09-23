package com.rajesh.Entity;

import java.util.List;

public class Movies {

private Integer movieId;	
private String movieName;
private String  genre;
private Double ticketPrice;
private List<Bookings> bookings;
public Movies(Integer movieId, String movieName, String genre, Double ticketPrice, List<Bookings> bookings) {
	super();
	this.movieId = movieId;
	this.movieName = movieName;
	this.genre = genre;
	this.ticketPrice = ticketPrice;
	this.bookings = bookings;
}
public Movies() {
	// TODO Auto-generated constructor stub
}
public Integer getMovieId() {
	return movieId;
}
public void setMovieId(Integer movieId) {
	this.movieId = movieId;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public Double getTicketPrice() {
	return ticketPrice;
}
public void setTicketPrice(Double ticketPrice) {
	this.ticketPrice = ticketPrice;
}
public List<Bookings> getBookings() {
	return bookings;
}
public void setBookings(List<Bookings> bookings) {
	this.bookings = bookings;
}
@Override
public String toString() {
	return "Movies [movieId=" + movieId + ", movieName=" + movieName + ", genre=" + genre + ", ticketPrice="
			+ ticketPrice + ", bookings=" + bookings + "]";
}




}
