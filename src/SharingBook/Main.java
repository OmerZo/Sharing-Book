package SharingBook;

import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

public class Main {

	public static Set<User> usersSet;

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

	public static void main(String[] args) {
		int numin, userId, index = 0, g = 0;
		String Password, UserName, SecondPassword;
		loadUsers();

		System.out.println("Welcome to Sharing Book");
		System.out.println("If you want to sign in enter 1 to log in enter 2 ");
		Scanner scanner = new Scanner(System.in);
		numin = scanner.nextInt();

		while ((numin == 1) && (index == 0)) {
			if (g == 1) {
				System.out.println("Wrong password enter details again");

			}
			System.out.println("Enter Id");
			userId = scanner.nextInt();
			System.out.println("Enter UserName");
			UserName = scanner.next();
			System.out.println("Enter Password");
			Password = scanner.next();
			System.out.println("Repeat the password");
			SecondPassword = scanner.next();
			if (Password.equals(SecondPassword)) {
				index = 1;
			} else
				g = 1;

			User newUser = new User(UserName, Password, userId);
			newUser.add_detail_to_borrowList();
			newUser.add_detail_wishlist();
			usersSet.add(newUser);
			saveUsers();
			
		}
	}

}
