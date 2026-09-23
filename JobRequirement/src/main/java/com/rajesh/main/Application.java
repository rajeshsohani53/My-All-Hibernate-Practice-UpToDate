package com.rajesh.main;
import com.rajesh.Entity.Job;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Configuration configuration=new Configuration();
       configuration.configure();
       SessionFactory Sessionfactory=configuration.buildSessionFactory();
       Session session=Sessionfactory.openSession();
       Transaction tx=session.beginTransaction();
       Job job=new Job();
      // job.setId(1);
       job.setName("Rajesh");
       job.setRole("CEO");
       job.setSalary(800000d);
       job.setSkills("Profit");
       session.persist(job);
       tx.commit();
       session.close();
       Sessionfactory.close();
       
       
	}

}
