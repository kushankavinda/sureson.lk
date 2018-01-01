package com.sureson.views;

import java.io.IOException;

import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sureson.controllers.Check_login;

import restApi.UserDetailsRest;

//@WebServlet("/Login")
public class Login extends HttpServlet {
	   @Override
	    public void doPost(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
		 
		  String uname=req.getParameter("login_uname");
		  String password=req.getParameter("login_psw");
	      System.out.println("login servlet is running username is : "+uname);
	      Check_login  check_login  = new Check_login ();
	      String response_message=Check_login.check_user_login(uname, password);
	      
	      HttpSession session = req.getSession();
	      session.setAttribute("uname", uname);
	      session.setAttribute("password",password);
	      System.out.println("session user name : "+(String)session.getAttribute("uname"));
	      
	      String session_value=(String) session.getAttribute("uname");
	      
	     
	      UserDetailsRest userDetailsRest= new UserDetailsRest();
	      try {
			userDetailsRest.getUsers(response_message);
		} catch (NoSuchMethodException | ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error when calling rest response message to get users method");
		}
	      
	   }
}
