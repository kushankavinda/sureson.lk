package com.sureson.views;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sureson.controllers.Controll_Registered_users;

import clover.org.apache.commons.collections.map.StaticBucketMap;
//@WebServlet("/GetRegisterUser")
public class GetRegisterUser extends HttpServlet {
	   @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
		 
		  String uname=req.getParameter("uname");
		  String email=req.getParameter("emauil_us");
		  String phone=req.getParameter("phone");
		  String password=req.getParameter("password");
		  /* Controll_Registered_users  controll_Registered_users  = new Controll_Registered_users ();
		   String a= controll_Registered_users.getUser(1);
		   System.out.println("view is coming to the party baby : "+a);	*/
		   System.out.println("passing data throught servlet");
		   Controll_Registered_users  controll_Registered_users  = new Controll_Registered_users ();
		   controll_Registered_users.addUser(uname,email,phone,password);
	   }
}
