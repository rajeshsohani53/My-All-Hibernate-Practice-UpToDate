package com.rajesh.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rajesh.entity.*;
public class EntityDao {
	public void insert(VehicalRegistration vehical) {
	    SessionFactory factory = SessionProvider.GetSession();
	    Session s = factory.openSession();
	    Transaction tx = s.beginTransaction();

	    s.persist(vehical);   // adds vehical as a new row

	    tx.commit();
	    s.close();
	}
   public VehicalRegistration  getVehicleById(Integer id)
   {
	   SessionFactory factory=SessionProvider.GetSession();
       Session s=factory.openSession();
       VehicalRegistration v=  s.get(VehicalRegistration.class, id);
	   
	   return v;
   }
   
   public List<VehicalRegistration> getAllVehicle()
   {
	   SessionFactory factory=SessionProvider.GetSession();
       Session s=factory.openSession();
       Transaction tx=s.beginTransaction();
	   
	   return null;
	   
   }
   
   public void updateVehicle(VehicalRegistration vehical)
   {
	   SessionFactory factory=SessionProvider.GetSession();
       Session s=factory.openSession();
        Transaction tx=s.beginTransaction(); 
       s.merge(vehical);
       tx.commit();
      
       
       
       
       
	   
   }
   
   public void deleteVehicleById(int id)
   {
	   SessionFactory factory=SessionProvider.GetSession();
       Session s=factory.openSession();
       //first get the vehical and build the object of that vehicle 
       VehicalRegistration v=  s.get(VehicalRegistration.class, id);
       if(v!=null)
       {
    	   s.remove(v);
       }
	   
	   
   }
}
