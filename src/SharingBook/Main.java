package SharingBook;

import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		//saveTest();
		loadTest();

		/*
		 * int numin, idnew, index=0, g=0; String Password, UserName, SecondPassword, d;
		 * 
		 * ArrayList<String> wishList= new ArrayList<>(); ArrayList<String> ToBorrowList
		 * = new ArrayList<>();
		 * 
		 * System.out.println("Welcome to Sharing Book");
		 * System.out.println("If you want to sign in enter 1 to log in enter 2 ");
		 * Scanner s = new Scanner(System.in); numin = s.nextInt();
		 * 
		 * while ((numin==1)&&(index==0)) { if(g==1) {
		 * System.out.println("Wrong password enter details again");
		 * 
		 * } System.out.println("Enter Id"); idnew=s.nextInt();
		 * System.out.println("Enter your wish list until 1"); d=s.next();
		 * while(!d.equals("1")) { wishList.add(d);
		 * System.out.println("Enter your wish list until 1"); d=s.next();
		 * 
		 * 
		 * } System.out.println("Enter your to borrow list until 1"); d=s.next();
		 * while(!d.equals("1")) { ToBorrowList.add(d);
		 * System.out.println("Enter your wish list until 1"); d=s.next();
		 * 
		 * }
		 * 
		 * System.out.println("Enter UserName"); UserName = s.next();
		 * System.out.println("Enter Password"); Password = s.next();
		 * System.out.println("Repeat the password"); SecondPassword=s.next(); if
		 * (Password.equals(SecondPassword)) { index=1; } else g=1;
		 * 
		 * 
		 * //login.Add_User(wishList, ToBorrowList, UserName, Password, idnew);
		 * 
		 * 
		 * User NewLogin= new User (UserName,Password,idnew); //wishList.add(d);
		 * System.out.println(NewLogin.getId());
		 * 
		 * Login log = new Login(); log.createFile();
		 * log.usingBufferedWritter(NewLogin);
		 * 
		 * 
		 * }
		 * 
		 * 
		 */

	}

	
	public static void saveTest() {
		Set<User> userList = new HashSet();
		User u = new User("user1", "pass", 123);
		userList.add(u);
		FileManager<User> fileM = new FileManager<User>("Users.txt");
		fileM.write(userList);
	}
	
	
	
	public static void loadTest() {
		Set<User> userList;
		FileManager<User> fileM = new FileManager<User>("Users.txt");
		userList = fileM.read();
		
		for(User user : userList)
		{
			System.out.println("UserName = " + user.getUserName());
		}
	}
	
}


