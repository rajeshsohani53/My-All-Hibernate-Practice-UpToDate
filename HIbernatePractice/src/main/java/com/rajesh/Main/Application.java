package com.rajesh.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rajesh.Entity.ClothingBrands;

public class Application {
    public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure();//load the config file 
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		 Transaction tx=session.beginTransaction();
		 
		 ClothingBrands brands=new ClothingBrands();
		 brands.setId(1);
		 brands.setName("H&M");
		 brands.setType("T-Shirts");
		 brands.setRate(499);
		 
		 session.persist(brands);
		 tx.commit();
		 session.close();
		 factory.close();
		 
		 

    }
}
