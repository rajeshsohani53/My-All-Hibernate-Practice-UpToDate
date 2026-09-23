package com.rajesh.entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionProvider {
	
	public static SessionFactory factory;
   public static SessionFactory GetSession()
   {
	  if(factory==null)
	  {
		  Configuration con=new Configuration().configure();
		  factory=con.buildSessionFactory();
		  
	  }
	   
	  return factory; 
   }
}
