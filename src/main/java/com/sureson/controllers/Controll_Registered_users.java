package com.sureson.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sureson.models.Registered_users;

public class Controll_Registered_users {
	  
	  public static String getUser(int a) {
		 
		Registered_users addRegisterUsers_retrive= new Registered_users();  
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession(); 
	    session=sessionFactory.openSession();
	    session.beginTransaction();
	    addRegisterUsers_retrive = (Registered_users)session.get(Registered_users.class,a);
	    System.out.println("user name retrive"+addRegisterUsers_retrive.getU_name());
	    return addRegisterUsers_retrive.getEmail();
	   // session.close(); 
		// return null;
	}
	  public static String addUser(String uname,String email,String phone,String password) {
		  Password_hash password_hash=new Password_hash();
		  password=password_hash.hashPassword(password);
		  try {
		  SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		  Session session=sessionFactory.openSession();
		  Registered_users addRegisterUsers= new Registered_users();
			addRegisterUsers.setU_name(uname);
			addRegisterUsers.setEmail(email);
			addRegisterUsers.setEmail(phone);
			addRegisterUsers.setPassword(password);
		
		    session.beginTransaction();
		    session.save(addRegisterUsers);
		    session.getTransaction().commit();
		    session.close();
		  }catch(Exception e) {
			  System.out.println("Exception is comming when write data on database");
		  }
			
			return null;
	  }
	
}
