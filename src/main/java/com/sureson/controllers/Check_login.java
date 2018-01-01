package com.sureson.controllers;


import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sureson.models.Registered_users;

import java.util.List;

public class Check_login {
	public static String check_user_login (String uname,String password) {		
		  Password_hash password_hash_login=new Password_hash();
		  password=password_hash_login.hashPassword(password);
		  try {
			  Registered_users addRegisterUsers= new Registered_users();
			  SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			  Session session=sessionFactory.openSession(); 
			  
			  String hql = "SELECT R.password FROM Registered_users R WHERE R.u_name = "+"'"+uname+"'"; 
			  Query query = session.createQuery(hql);
			  List results =query.getResultList();
			  
			  int success_check=0;
			  for(int i=0;i<results.size();i++) {
				  if(results.get(i).equals(password)) {
					  //enter password and user name to session		  
					  System.out.println("uname : "+uname+" passowrd : "+password +"entered to the session");
					  ++success_check;
				  }	  
			  }
			  if(success_check>0){
				  return "user login is sucess";
			  }else {
				  return "user login is not sucess";
			  }
		  }catch(HibernateException e) {
			  System.out.println("Exception is comming when retrive data on database");
			  return "user login is not sucess";
		  }		
	}
}