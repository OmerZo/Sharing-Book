package SharingBook;

import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

public class Main {

	public static Set<User> usersSet;

	public static void add_detail_wishlist(ArrayList<Book> wishList) {
		String mName, mAuthor, ifitis;
		System.out.println("Enter your wish 1 to stop enter 2 to enter new book");
		Scanner l = new Scanner(System.in);
		ifitis = l.next();
		while (ifitis.equals("2")) {
			System.out.println("Enter name of book");
			mName = l.next();
			System.out.println("Enter author of the book");
			mAuthor = l.next();
			System.out.println("Enter the type of the book");
			Scanner s = new Scanner(System.in);
			int mType = s.nextInt();
			Book NewBook = new Book(mName, mAuthor, mType);
			wishList.add(NewBook);
			System.out.println("The book is insert");
			System.out.println("Enter your wish 1 to stop enter 2 to enter new book");
			ifitis = l.next();

		}

	}

	public static void add_detail_to_borrowList(ArrayList<Book> ToBorrowList) {
		String mName, mAuthor, ifitis, i;
		System.out.println("Enter your wish 1 to stop enter 2 to enter new book");
		Scanner l = new Scanner(System.in);
		ifitis = l.next();
		while (ifitis.equals("2")) {
			System.out.println("Enter name of book");
			mName = l.next();
			System.out.println("Enter author of the book");
			mAuthor = l.next();
			System.out.println("Enter the type of the book");
			Scanner s = new Scanner(System.in);
			int mType = l.nextInt();
			Book NewBook = new Book(mName, mAuthor, mType);
			ToBorrowList.add(NewBook);
			System.out.println("The book is insert");
			System.out.println("Enter your wish 1 to stop enter 2 to enter new book");
			ifitis = l.next();

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
