package com.rajesh.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ConnectionProvider {
    public static Session getSession()
    {
    	Configuration configuration=new Configuration();
        configuration.configure();
        SessionFactory Sessionfactory=configuration.buildSessionFactory();
        Session session=Sessionfactory.openSession();
        Transaction tx=session.beginTransaction();
    	return session;
    }
}
