package restApi;


import com.sureson.controllers.Check_login;


public class AddRegisterUser {
	public static void main (String args[]) {
		 Check_login  check_login  = new Check_login ();
	     System.out.println(Check_login.check_user_login("kushan", " "));
	}
}
