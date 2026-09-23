package com.rajesh.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rajesh.Entity.Bookings;
import com.rajesh.Entity.Customer;
import com.rajesh.Entity.Movies;

public class InsertBookingPracticeData {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Movies pushpa = new Movies();
		pushpa.setMovieName("Pushpa 2");
		pushpa.setGenre("Action");
		pushpa.setTicketPrice(300d);
		session.save(pushpa);

		Movies kalki = new Movies();
		kalki.setMovieName("Kalki 2898 AD");
		kalki.setGenre("Sci-Fi");
		kalki.setTicketPrice(350d);
		session.save(kalki);

		Movies stree = new Movies();
		stree.setMovieName("Stree 2");
		stree.setGenre("Comedy-Horror");
		stree.setTicketPrice(250d);
		session.save(stree);

		Customer amit = new Customer();
		amit.setCustomerName("Amit Sharma");
		amit.setCustomerEmail("amit.sharma@gmail.com");
		amit.setCustomerCity("Pune");
		session.save(amit);

		Customer priya = new Customer();
		priya.setCustomerName("Priya Verma");
		priya.setCustomerEmail("priya.verma@gmail.com");
		priya.setCustomerCity("Mumbai");
		session.save(priya);

		Customer rahul = new Customer();
		rahul.setCustomerName("Rahul Singh");
		rahul.setCustomerEmail("rahul.singh@gmail.com");
		rahul.setCustomerCity("Delhi");
		session.save(rahul);

		Customer sneha = new Customer();
		sneha.setCustomerName("Sneha Patil");
		sneha.setCustomerEmail("sneha.patil@gmail.com");
		sneha.setCustomerCity("Nagpur");
		session.save(sneha);

		Customer vikram = new Customer();
		vikram.setCustomerName("Vikram Rao");
		vikram.setCustomerEmail("vikram.rao@gmail.com");
		vikram.setCustomerCity("Pune");
		session.save(vikram);

		// Amit -> total 1700 (> 1500)
		saveBooking(session, amit, pushpa, 3, 800d);
		saveBooking(session, amit, kalki, 2, 900d);

		// Priya -> total 1100 (<= 1500)
		saveBooking(session, priya, stree, 2, 600d);
		saveBooking(session, priya, pushpa, 1, 500d);

		// Rahul -> total 2000 (> 1500)
		saveBooking(session, rahul, kalki, 4, 2000d);

		// Sneha -> total 1400 (<= 1500)
		saveBooking(session, sneha, stree, 3, 700d);
		saveBooking(session, sneha, pushpa, 2, 700d);

		// Vikram -> total 2000 (> 1500)
		saveBooking(session, vikram, kalki, 3, 1000d);
		saveBooking(session, vikram, stree, 3, 1000d);

		tx.commit();
		session.close();
		sessionFactory.close();
	}

	private static void saveBooking(Session session, Customer customer, Movies movie, int seats, double totalAmount) {
		Bookings booking = new Bookings();
		booking.setCustomer(customer);
		booking.setMovies(movie);
		booking.setSeats(seats);
		booking.setBookingDate(LocalDate.now());
		booking.setTotalAmount(totalAmount);
		session.save(booking);
	}
}
