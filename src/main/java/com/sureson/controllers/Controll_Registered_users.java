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
		Registered_users addRegisterUsers= new Registered_users();
		
		addRegisterUsers.setU_name("sahan");
		addRegisterUsers.setEmail("kumail2");
		addRegisterUsers.setPassword("ranwala");
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	    Session session=sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(addRegisterUsers);
	    session.getTransaction().commit();
	  //  session.close();
	    
	    addRegisterUsers = null ;
	    
	   // session=sessionFactory.openSession();
	  //  session.beginTransaction();
	    addRegisterUsers = (Registered_users)session.get(Registered_users.class,a);
	    System.out.println("user name retrive"+addRegisterUsers.getU_name());
	    return addRegisterUsers.getEmail();
	    //session.close();
	}
	 public static List<Name> getUser() {
		 List <Name> list =new ArrayList<>();
		// list.add("1");
		// list.add("9");
		 return list;	 
	 }
}
