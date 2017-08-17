
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import 	java.util.Iterator;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWrite {

	String user, pass, id;
	int age;
	
	
	JSONWrite(String user, String pass, int age, String id){
		this.user = user;
		this.pass = pass;
		this.age= age;
		this.id= id;
	}
	
	@SuppressWarnings("unchecked")
	public void write() throws IOException {
		
		JSONObject obj = new JSONObject();
		
		obj.put("user", user);
		obj.put("password", pass);
		obj.put("age", age);
		
		obj.put("id", id);
		
		
		
		String out = obj.toString();
		
		System.out.println(out);
	
		try(FileWriter file = 
				new FileWriter("/home/eduardo/workspace/JavaTest/src/" + id + ".txt")){
			file.write(obj.toString());
			System.out.println("Copiado completado!");
			System.out.println("\nJSON Object: " + obj);
		}
		
		
		
	}
}
