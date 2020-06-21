package SharingBook;

import java.util.Scanner;
import java.util.Set;

public class Main {

	public static Set<User> usersSet;
	public static Scanner scanner = new Scanner(System.in);
	public static void menu(User user)
	{
		int option;
		while (true) {
			System.out.println("\n\nPlease select an option:\n1.Add new book to wish list\n2.Add new book to borrow list\n3.Exit");
			option = scanner.nextInt();

			if (option == 1) {
				user.addWishBook();
				saveUsers();
			} else if (option == 2) {
				user.addBorrowBook();
				saveUsers();
			} else if (option == 3) {
				break;
			}
		}
		
	}

	public static void loadUsers() {
		FileManager<User> fileM = new FileManager<User>("Users.txt");
		usersSet = fileM.read();

		for (User user : usersSet) {
			System.out.println(user);
		}
	}

	public static void saveUsers() {
		FileManager<User> fileM = new FileManager<User>("Users.txt");
		fileM.write(usersSet);
	}

	public static User signIn() {
		String UserName, Password, SecondPassword;
		int userId;

		System.out.print("Enter Id: ");
		userId = scanner.nextInt();
		System.out.print("Enter UserName: ");
		UserName = scanner.next();

		do {
			System.out.print("Enter Password: ");
			Password = scanner.next();
			System.out.print("Repeat the password: ");
			SecondPassword = scanner.next();
		} while (!Password.equals(SecondPassword));

		return new User(UserName, Password, userId);
		
	}
    public static User logIn() {
    
    	
    	
		String UserName,Password;
		int Id;
		User userCheck = null;
		System.out.println("Enter UserName: ");
		UserName = scanner.next();
		System.out.println("Enter Password: ");
		Password = scanner.next();
		System.out.println("Enter Id: ");
		Id = scanner.nextInt();
		loadUsers();
		
		for (User user : usersSet) {
			if((user.getId()==Id )&&(user.getUserName().equals(UserName))&&user.getPassword().equals(Password))
			{
				System.out.println(user);
				userCheck = user;
				break;
			}
			
		}
		return userCheck;
		
	}

	public static void main(String[] args) {
		int option;
		User user = null;

		loadUsers();

		System.out.println("Welcome to Sharing Book\n");
		System.out.println("Please select an option:\n1.Sign in\n2.Log in");
		option = scanner.nextInt();

		if (option == 1) {
			user = signIn();
			usersSet.add(user);
			saveUsers();
		} else {
				
			user= logIn();
			while(user ==null)
			{
				System.out.println("The details are wrong\n try again\n");
				user = logIn();
				
			}
		}
		

		menu(user);

		
		saveUsers();
	}

}
