package com.rajesh.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.rajesh.Entity.Customer;

public class FetchCustomerBookingAbove1500_HQL {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		// Display customer detail whose total booking amount is greater than 1500
		String hql = "select c from Customer c join c.bookings b "
				+ "group by c.customerId, c.customerName, c.customerEmail, c.customerCity "
				+ "having sum(b.totalAmount) > 1500";

		Query<Customer> query = session.createQuery(hql, Customer.class);
		List<Customer> list = query.getResultList();

		for (Customer c : list) {
			System.out.println(c);
		}

		session.close();
		sessionFactory.close();
	}
}
