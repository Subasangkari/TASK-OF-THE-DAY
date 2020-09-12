package com.mysba.demo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysba.demo.model.DxcUsers;

@Component
@Transactional
public class DxcUsersDao {
	
    @Autowired
	SessionFactory sessionFactor;
    public String saveUser(DxcUsers dxcUsers) {
    	try {
    	Session session=sessionFactor.getCurrentSession();
    	session.save(dxcUsers);
    	return "user created";
    	}
    	catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
    	return "cannot create user";
    }
    
    public List<DxcUsers> getAllUsers()
	{
	try
	{
		Session session=sessionFactor.getCurrentSession();
		Query query=session.createQuery("select a from DxcUsers a");
	    System.out.println(query);
	ArrayList<DxcUsers> dxcusers=(ArrayList<DxcUsers>)query.list();
	return dxcusers ;
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	return null;
	}
    
	public DxcUsers getUserById(int userId){
		try{
			Session session=sessionFactor.getCurrentSession();
		DxcUsers dxcUsers=(DxcUsers)session.get(DxcUsers.class,userId);
		return dxcUsers;
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
		return null;
		}
	DxcUsers dxcusers;
	public String updateUserById(String password,int userId){
		try{
		Session session=sessionFactor.getCurrentSession();
		System.out.println("dxcUsers"+userId);
		System.out.println("dxcUsers"+password);
		Query query=session.createQuery("update DxcUsers as a set a.password=:password where a.userId=:userId");
		System.out.println(query);
	    int pwd=query.setString("password", password).setInteger("userId", userId).executeUpdate();
	    
			/*
			 * session.update("dxcUsers",password);
			 */
		return "Password Updated";
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
		return "Cannot Update Password";
		}
	
    
}
