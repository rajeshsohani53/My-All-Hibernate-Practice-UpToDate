package com.rajesh;

import java.beans.Transient;
import com.rajesh.Entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {
  public static void main(String[] args) {
	Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory factory=configuration.buildSessionFactory();
	 Session session=factory.openSession();
	 
	 Transaction tx=session.beginTransaction();
	 Menu m=new  Menu();
	 m.setName("A");
	 m.setPrice(12000D);
	 m.setDescription("nutration value 120gm protine");
	 session.persist(m);
	 
	 tx.commit();
}
  
}
