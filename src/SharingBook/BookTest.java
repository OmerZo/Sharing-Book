package SharingBook;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import SharingBook.BookTest;  

import SharingBook.UserController;


class BookTest {
	
	@Test
	void WrongBookType1() {
		UserController user = new UserController();
		try {
			user.GoodBook("Home", "Omer Lalo", 5);
			
			
		}catch (IllegalArgumentException e) {
			
			Assertions.assertEquals("somthing is not valid",e.getMessage());
			
		}
	}
	
	@Test
	void WrongBookType2() {
		UserController user = new UserController();
		try {
			user.GoodBook("Home", "Omer Lalo", 0);
			
			
		}catch (IllegalArgumentException e) {
			
			Assertions.assertEquals("somthing is not valid",e.getMessage());
			
		}
	}
	
	@Test
	void WrongBookType3() {
		UserController user = new UserController();
		try {
			user.GoodBook("Home", "Omer Lalo", -1);
			
			
		}catch (IllegalArgumentException e) {
			
			Assertions.assertEquals("somthing is not valid",e.getMessage());
			
		}
	}
	
	@Test
	void WrongBookMname() {
		UserController user = new UserController();
		try {
			user.GoodBook("", "Omer Lalo", 3);
			
			
		}catch (IllegalArgumentException e) {
			
			Assertions.assertEquals("somthing is not valid",e.getMessage());
			
		}
	}
	
	@Test
	void WrongBookMname1() {
		UserController user = new UserController();
		try {
			user.GoodBook(null, "Omer Lalo", 3);
			
			
		}catch (IllegalArgumentException e) {
			
			Assertions.assertEquals("somthing is not valid",e.getMessage());
			
		}
	}
	@Test
	void GoodBookMname() {
		UserController user = new UserController();
		try {
			user.GoodBook("Home", "Omer Lalo", 3);
			
			
		}catch (IllegalArgumentException e) {
			
			Assertions.assertEquals("somthing is not valid",e.getMessage());
			
		}
	}
	
	@Test
	void WrongBookmAuthor() {
		UserController user = new UserController();
		try {
			user.GoodBook("Home", "", 3);
			
			
		}catch (IllegalArgumentException e) {
			
			Assertions.assertEquals("somthing is not valid",e.getMessage());
			
		}
	}
	
	@Test
	void WrongBookmAuthor1() {
		UserController user = new UserController();
		try {
			user.GoodBook("Home", null , 3);
			
			
		}catch (IllegalArgumentException e) {
			
			Assertions.assertEquals("somthing is not valid",e.getMessage());
			
		}
	}
	
	@Test
	void GoodBookmAuthor() {
		UserController user = new UserController();
		try {
			user.GoodBook("Home", "Omer Lalo", 3);
			
			
		}catch (IllegalArgumentException e) {
			
			Assertions.assertEquals("somthing is not valid",e.getMessage());
			
		}
	}
	
	
	
	

}
