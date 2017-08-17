import java.util.*;


public class User {
	
	String name;
	String password;
	String id;
	
	User(String name, String password){
		
		this.name = name;
		this.password = password;
		this.id = generateId();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	private String generateId(){
		
		Random random = new Random();
		
		String id = "";
		
		String[] characters = {"0","1","2","3","4","5","6","7","8","9"};
			
		while(id.length()<9){
			
			id = id + characters[random.nextInt(characters.length)];
			
		}
		
		return id;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
}
