package com.rajesh.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchMovieBookingStats_HQL {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		// Movie name, genre, no. of bookings, no. of distinct customers, total revenue
		String hql = "select m.movieName, m.genre, count(b), count(distinct b.customer), sum(b.totalAmount) "
				+ "from Movies m join m.bookings b "
				+ "group by m.movieId, m.movieName, m.genre";

		Query<Object[]> query = session.createQuery(hql, Object[].class);
		List<Object[]> list = query.getResultList();

		for (Object[] row : list) {
			System.out.println("Movie: " + row[0] + ", Genre: " + row[1] + ", Bookings: " + row[2]
					+ ", Customers: " + row[3] + ", Revenue: " + row[4]);
		}

		session.close();
		sessionFactory.close();
	}
}
