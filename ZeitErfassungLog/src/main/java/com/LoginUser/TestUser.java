package com.LoginUser;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestUser {

	public static void main(String[] args) {
		
		
		
		  User user1 = new User();
		 user1.setName("Otto");
		 user1.setPassword("789");
		  
		  
		  SessionFactory factory = new Configuration().configure().buildSessionFactory(); 
		  Session session = factory.openSession(); session.beginTransaction(); session.save(user1);
		  session.getTransaction().commit();
		  session.close();
		 
		 
		

	}

}
