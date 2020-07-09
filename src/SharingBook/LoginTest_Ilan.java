package SharingBook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import SharingBook.UserController;


class LoginTest_Ilan {
	User user1 = null;
	@Test
	void failLogInEmptyId() {
		UserController user = new UserController();
		try {
			user.LogIn(0, "Liat", "123",user1);
			
			
		}catch (IllegalArgumentException e) {
			
			Assertions.assertEquals("somthing is not valid",e.getMessage());
			
		}
				
	}
	
	@Test
	void failSignInEmptyStringName() {
		UserController user = new UserController();
		try {
			user.LogIn(209186136, "", "123",user1);
			
		}catch (IllegalArgumentException e) {
			
			Assertions.assertEquals("somthing is not valid",e.getMessage());
			
		}
				
	}
	
	@Test
	void failSignInEmptyStringPass() {
		UserController user = new UserController();
		try {
			user.LogIn(209186136, "Liat", "",user1);
			
		}catch (IllegalArgumentException e) {
			
			Assertions.assertEquals("somthing is not valid",e.getMessage());
			
		}
				
	}
	
	@Test
	void failSignInEmptyUser() {
		UserController user = new UserController();
		try {
			user.LogIn(209186139, "Liat", "123", null);

		}catch (IllegalArgumentException e) {
			
			Assertions.assertEquals("somthing is not valid",e.getMessage());
			
		}

	}
	

}
