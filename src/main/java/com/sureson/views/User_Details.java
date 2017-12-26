package com.sureson.views;

import java.io.File;

import com.sureson.controllers.Controll_Registered_users;

public class User_Details{
	public static void main(String args[]) {
		/*Controll_Registered_users  controll_Registered_users  = new Controll_Registered_users ();
		String a= controll_Registered_users.getUser(1);
		System.out.println("view is coming to the party baby : "+a);*/
	//	System.out.println("k8ush");
		User_Details a =new User_Details();
		/*ClassLoader classLoader = a.getClass().getClassLoader();
		File file = new File(classLoader.getResource("User_Details").getFile());
		System.out.println(file.getAbsolutePath());*/
		System.out.println(a.getClass().getClassLoader().getResourceAsStream("myFeatures.properties"));
		
	}	
	public static void testing() {
		System.out.println("tesing okay");	
		Controll_Registered_users  controll_Registered_users  = new Controll_Registered_users ();
		String a= controll_Registered_users.getUser(1);
		System.out.println("view is coming to the party baby : "+a);
		//this.getClass().getClassLoader().getResourceAsStream("myFeatures.properties");
	}
}


