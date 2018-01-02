package restApi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import clover.com.google.common.io.Files;

@Path("/aboutKushan")
public class UserDetailsRest {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	
	public String getUsers()  {
	return "rest api text palin";
	}
}
