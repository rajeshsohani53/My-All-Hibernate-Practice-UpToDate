package com.rajesh.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rajesh.Entity.Job;

public class EmployeDao {

    
    static Session session = ConnectionProvider.getSession();

    
    public static Job getEmployee(Integer id) {
        Job job = session.get(Job.class, id);
        return job;
    }

    
    public static void insert(Job job) {
        Transaction tx = session.beginTransaction();
        session.persist(job);       
        tx.commit();
    }

    
    public static void update(Job job) {
        Transaction tx = session.beginTransaction();
        session.merge(job);         
        tx.commit();
    }

    
    public static void delete(Integer id) {
        Transaction tx = session.getTransaction();
        if (!tx.isActive()) {
            tx.begin();
        }
        Job job = getEmployee(id);
        session.remove(job);
        tx.commit();
    }
}