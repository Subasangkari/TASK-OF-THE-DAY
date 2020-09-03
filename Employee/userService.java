package com.myapp.service;

import java.util.Date;

import com.myapp.dao.userDao;
import com.myapp.model.user;

public class userService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isActive=false;
		if(isActive==true) {
			char yes='y';	
		}
		else {
			char no='n';
		}
		user user=new user(1,"Michel",new Date(),isActive);
		user.setActive(true);
		userDao dao= new userDao();
		//dao.saveUser(user);
		System.out.println(dao.saveUser(user));
	}

}
