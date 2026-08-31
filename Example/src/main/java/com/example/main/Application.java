package com.example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.Entity.Trainers;

public class Application {
  public static void main(String[] args) 
  {
	
	// 1. Create Configuration object
	 Configuration config=new Configuration();
	// 2. Load hibernate.cfg.xml
	//config.configure("hibernate.cfg.xml");
	 config.configure();
	 // 3. Create SessionFactory
    SessionFactory factory = config.buildSessionFactory();
	//4. open session 
    Session session=factory.openSession();
   // 5. Start Transaction
    Transaction tx = session.beginTransaction();
    // 6. Create Trainer object
    Trainers t = new Trainers();

    t.setId(103);
    t.setName("hitler");
    t.setSalary(10000);
    t.setExp(30);
    t.setSubjects("Propegenda");

    // 7. Save object
   // session.save(t);
    session.persist(t);

    // 8. Commit Transaction
    tx.commit();

    // 9. Close session
    session.close();

    // 10. Close factory
    factory.close();

  }
}
