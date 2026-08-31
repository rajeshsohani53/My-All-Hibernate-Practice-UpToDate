package com.rajesh.HIbernate01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rajesh.HIbernate01.entity.Student;
import com.rajesh.HIbernate01.util.HibernateUtil;

public class App
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        // Save a new student
        int savedId;
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            Student student = new Student("Rajesh", "rajesh@example.com", "Computer Science");
            session.save(student);
            savedId = student.getId();

            transaction.commit();
            System.out.println("Saved student with id: " + savedId);
        }

        // Fetch it back
        try (Session session = sessionFactory.openSession()) {
            Student student = session.get(Student.class, savedId);
            System.out.println("Fetched: " + student);
        }

        HibernateUtil.shutdown();
    }
}
