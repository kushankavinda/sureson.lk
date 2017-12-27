package restApi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/aboutKushan")
public class UserDetailsRest {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getUsers() {
		return "kushan is unstoppable yes";
	}
}

