package com.sureson.views;

import com.sureson.controllers.Controll_Registered_users;

public class User_Details{
	public static void main(String args[]) {
		Controll_Registered_users  controll_Registered_users  = new Controll_Registered_users ();
		String a= controll_Registered_users.getUser(1);
		System.out.println("view is coming to the party baby : "+a);
	//	System.out.println("k8ush");
	}
}


