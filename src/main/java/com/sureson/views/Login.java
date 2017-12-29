package com.sureson.views;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sureson.controllers.Check_login;

//@WebServlet("/Login")
public class Login extends HttpServlet {
	   @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
		 
		  String uname=req.getParameter("login_uname");
		  String password=req.getParameter("login_psw");
	      System.out.println("login servlet is running username is : "+uname);
	      Check_login  check_login  = new Check_login ();
	      System.out.println(Check_login.check_user_login(uname, password));
	   }
}
