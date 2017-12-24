package restApi;

import java.util.List;
import java.util.jar.Attributes.Name;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.sureson.controllers.Controll_Registered_users;

@Path("/users")

public class User_Details {
	Controll_Registered_users  controll_Registered_users  = new Controll_Registered_users ();
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<Name> getMessages() {
		return Controll_Registered_users.getUser();
		//return "kucdjbdfshbv";
	}
}
