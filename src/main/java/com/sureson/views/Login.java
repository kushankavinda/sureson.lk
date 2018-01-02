package com.sureson.views;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sureson.controllers.Check_login;

import restApi.UserDetailsRest;
import sun.nio.cs.StandardCharsets;

//@WebServlet("/Login")
public class Login extends HttpServlet {
	   @Override
	    public void doPost(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
//request parametrs form front end request		  
		  String uname=req.getParameter("login_uname");
		  String password=req.getParameter("login_psw");
	      System.out.println("login servlet is running username is : "+uname);
//check user request with database	      
	      Check_login  check_login  = new Check_login ();
	      String response_message=Check_login.check_user_login(uname, password);
//store session variables
	      HttpSession session = req.getSession();
	      session.setAttribute("uname", uname);
	      session.setAttribute("password",password);
	      System.out.println("session user name : "+(String)session.getAttribute("uname"));
//retrive attributes from session	      
	      String session_value=(String) session.getAttribute("uname");
//call front end java script file by using Java Scripting API	      
	  		try {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("JavaScript");
			System.out.println("okay1");
			FileInputStream fileInputStream = new FileInputStream("C:/Users/Kushan/eclipse-workspace/sureson.lk/src/main/webapp/js/back_end_response.js");
			System.out.println("okay2");
		    if (fileInputStream != null){
		     BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
		     engine.eval(reader);
		     System.out.println("okay3");
		    // Invocable javascriptEngine = null;
		     System.out.println("okay4");
			Invocable invocableEngine = (Invocable)engine;
			 System.out.println("okay5");
			 System.out.println("invocableEngine is : "+invocableEngine);
		     Object object = invocableEngine.invokeFunction("backend_message",session_value);
		     
		     System.out.println("okay6");
		    }
			}catch(Exception e) {
				System.out.println("erroe when calling js function"+ e);
			}   
	    	      
	   }
}
