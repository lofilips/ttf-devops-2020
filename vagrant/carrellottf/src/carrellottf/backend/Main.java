package carrellottf.backend;

public class Main {

	public static void main(String[] args) {
		User u = UserRepository.getInstance().get("user88");
		System.out.println(u);

	}

}
