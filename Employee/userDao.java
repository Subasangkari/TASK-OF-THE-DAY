package com.myapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.myapp.model.user;

public class userDao {

	SessionFactory factory=null;
	public userDao() {
		// TODO Auto-generated constructor stub
		factory=new Configuration().configure().buildSessionFactory();
		
	}
	
		public String saveUser(user user) {
			
		try {	
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(user);
			tx.commit();
			return "user saved";
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			factory.close();
			}
		
		return "cannot save user";
		}

}
