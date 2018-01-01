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
	
	public String getUsers(String response_message) throws FileNotFoundException, ScriptException, NoSuchMethodException  {
		
		System.out.println("response_message to user : "+response_message);
	/*	try {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		System.out.println("okay1");
		FileInputStream fileInputStream = new FileInputStream("C:/Users/Kushan/eclipse-workspace/sureson.lk/src/main/webapp/js/back_end_response.js");
		System.out.println("okay2");
	    if (fileInputStream != null){
	     BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
	     engine.eval(reader);
	     System.out.println("okay3");
	     Invocable javascriptEngine = null;
	     System.out.println("okay4");
		Invocable invocableEngine = (Invocable)javascriptEngine;
		 System.out.println("okay5");
	     Object object = invocableEngine.invokeFunction("backend_message");
	     System.out.println("okay6");
	    }
		}catch(Exception e) {
			System.out.println("erroe when calling js function"+ e);
		}*/
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		// read script file
		engine.eval(Files.newReader(Paths.get("C:/Scripts/Jsfunctions.js"), StandardCharsets.UTF_8));

		Invocable inv = (Invocable) engine;
		// call function from script file
		inv.invokeFunction("yourFunction", "param");

	return response_message;
}}
