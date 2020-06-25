package SharingBook;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static Set<User> usersSet;
	public static Scanner scanner = new Scanner(System.in);

	public static void menu(User user) {
		int option;
		System.out.println(
				"\n\nPlease select an option:\n1.Add new book to wish list\n2.Add new book to borrow list\n3.Print your wish list\n4.Print your to borrow list\n5.Delete wish book\n6.Delete to borrow book\n7.To change Books from your wish list\n8.Exit");
		option = scanner.nextInt();
		
		switch (option) {
		case 1:
			user.addWishBook();
			break;
		case 2:
			user.addBorrowBook();
			break;
		case 3:
			for (Book book : user.wishList) {
				System.out.println(book);
			}
			break;
		case 4:
			for (Book book : user.toBorrowList) {
				System.out.println(book);
			}
			break;
		case 5:
			deleteBook(user, user.wishList);
			break;
		case 6:
			deleteBook(user, user.toBorrowList);
			break;
		case 7:
			exchangeBook(user);
			break;
		case 8:
			System.exit(0);
			break;

		default:
			break;
		}

//		if (option == 1) {
//			user.addWishBook();
//		} else if (option == 2) {
//			user.addBorrowBook();
//		} else if (option == 3) {
//			for (Book book : user.wishList) {
//				System.out.println(book);
//			}
//		} else if (option == 4) {
//			for (Book book : user.toBorrowList) {
//				System.out.println(book);
//			}
//		} else if (option == 5) {
//			deleteBook(user, user.wishList);
//		} else if (option == 6) {
//			deleteBook(user, user.toBorrowList);
//		} else if (option == 7) {
//			exchangeBook(user);
//		} else if (option == 8) {
//			System.exit(0);
//		}
	}

	public static void deleteBook(User user, List<Book> list) {
		int choice;
		System.out.println("This is your books list:");
		Iterator<Book> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			System.out.println("If you want to delete this book enter 1 else 2");
			choice = scanner.nextInt();
			if (choice == 1) {
				iter.remove();
			}
		}
	}

	public static void exchangeBook(User user) {
		int x = 0;
		Iterator<Book> currentUserBookItr = user.wishList.iterator();
		while(currentUserBookItr.hasNext()) {
//			Book currentUserBook = currentUserBookItr.next();
			System.out.println("Prim user book = " + currentUserBookItr.next().toString());
			Iterator<User> otherUserItr = usersSet.iterator();
			while (otherUserItr.hasNext()) {
//				User otherUser = otherUserItr.next();
				System.out.println("Other user = " + otherUserItr.next().toString());
				Iterator<Book> otherUserBookItr = otherUserItr.next().toBorrowList.iterator();
				while(otherUserBookItr.hasNext()) {
//					Book otherUserBook = otherUserBookItr.next();
					
					System.out.println("Other user book = " + currentUserBookItr.next().toString());
					if (currentUserBookItr.next().equals(currentUserBookItr.next())) {
						user.setCount_of_borrow(user.getCount_of_borrow() - 1);
						otherUserItr.next().setCount_of_give_book(otherUserItr.next().getCount_of_give_book() + 1);
						System.out.println("You received " + currentUserBookItr.next().getmName() + " from " + otherUserItr.next().getUserName());
						user.wishList.remove(currentUserBookItr.next());
						otherUserItr.next().toBorrowList.remove(currentUserBookItr.next());
//						x = 1;
//						break;

					}
					if (x == 0) {
						System.out.println("There is not a match");
					}
				}

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

		String UserName, Password;
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
			if ((user.getId() == Id) && (user.getUserName().equals(UserName)) && user.getPassword().equals(Password)) {
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
			user = logIn();
			while (user == null) {
				System.out.println("The details are wrong\nTry again\n");
				user = logIn();
			}
		}

		while (true) {
			menu(user);
			saveUsers();
		}
	}
}
