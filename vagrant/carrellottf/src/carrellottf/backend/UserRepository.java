package carrellottf.backend;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

	private static UserRepository instance;
	
	private Map<String,User> users = new HashMap<String,User>();
	
	private  UserRepository() {
		for (int i=0;i<100;i++)
			users.put("user"+i, new User("user" + i, "pw"+i, "Mario Rossi" + i));
	}
	
	public User get(String login) {
		return users.get(login);
	}
	
	static{
		instance = new UserRepository();
	}
	
	public static UserRepository getInstance() {
		return instance;
	}
	
}
