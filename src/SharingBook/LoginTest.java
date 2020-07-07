package SharingBook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import SharingBook.UserController;

class LoginTest {

	@Test
	void failLoginEmptyId() {
		UserController user = new UserController();
		try {
			user.SignIn(0, "Liat", "123");
			
			
		}catch (IllegalArgumentException e) {
			
			Assertions.assertEquals("somthing is not valid",e.getMessage());
			
		}
				
	}
	
	@Test
	void failLoginEmptyString() {
		UserController user = new UserController();
		try {
			user.SignIn(209186136, "", "123");
			
		}catch (IllegalArgumentException e) {
			
			Assertions.assertEquals("somthing is not valid",e.getMessage());
			
		}
				
	}
	
	@Test
	void failLoginEmptyPassword() {
		UserController user = new UserController();
		try {
			user.SignIn(209186139, "Liat", "");

		}catch (IllegalArgumentException e) {
			
			Assertions.assertEquals("somthing is not valid",e.getMessage());
			
		}

	}

}
