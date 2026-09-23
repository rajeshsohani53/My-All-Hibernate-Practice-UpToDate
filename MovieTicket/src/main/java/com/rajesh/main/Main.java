package com.rajesh.main;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.rajesh.Entity.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Configuration configuration=new Configuration();
   configuration.configure();
   SessionFactory sessionFactory= configuration.buildSessionFactory();
   Session session = sessionFactory.openSession();
   Transaction tx=session.beginTransaction();
   //session.save and at last tx.commit()
   //customer->movie->booking
    
   
   ///
    Customer customer=new Customer();
    customer.setCustomerName("Rajesh Sohani D");
    customer.setCustomerCity("Pune D");
    customer.setCustomerEmail("Dsohanirajesh53@gmail.com");
    session.save(customer);
    
    Movies movie=new Movies();
    movie.setMovieName("Pushpa-D");
    movie.setGenre("Action-D");
    movie.setTicketPrice(500d);
    session.save(movie);
    
    
    Bookings bookings=new Bookings();
    bookings.setCustomer(customer);
    bookings.setMovies(movie);
    bookings.setSeats(3);
    bookings.setBookingDate(LocalDate.now());
    bookings.setTotalAmount(1500d);
    session.save(bookings);
    
    
    
    tx.commit();
    session.close();
    
    
    
    
    
	
	}

}
