package carrellottf.backend.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import carrellottf.backend.User;
import carrellottf.backend.UserRepository;

class MainTest {

	@Test
	void userTest() throws Exception {
		User u = UserRepository.getInstance().get("user1");
		if (!u.getLogin().equals("user1"))
			throw new Exception();
	}
	
}
