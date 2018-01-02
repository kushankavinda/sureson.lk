package restApi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

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

public class AddRegisterUser {
	public static void main(String args[]) {
		try {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("JavaScript");
			System.out.println("okay1");
			FileInputStream fileInputStream = new FileInputStream(
					"C:/Users/Kushan/eclipse-workspace/sureson.lk/src/main/webapp/js/back_end_response.js");
			System.out.println("okay2");
			if (fileInputStream != null) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
				engine.eval(reader);
				System.out.println("okay3");
				Invocable javascriptEngine = null;
				System.out.println("okay4");
				Invocable invocableEngine = (Invocable) javascriptEngine;
				System.out.println("okay5");
				int x = 0;
				Object object = invocableEngine.invokeFunction("backend_message", x);

				System.out.println("okay6");
			}
		} catch (Exception e) {
			System.out.println("erroe when calling js function" + e);
		}
	}
}
