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
				"\n\nPlease select an option:\n1.Add new book to wish list\n2.Add new book to borrow list\n3.Print your wish list\n4.Print your to borrow list\n5.Delete wish book\n6.Delete to borrow book\n7.To change books from your wish list\n8.To change book from your borrow list\n9.Exit");
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
			if(user.getCount_of_give_book()-user.getCount_of_borrow() >= -2) {
				exchangeBook(user);
			    break;
			}
			else {
				System.out.println("You cant to borrow you must give book");
				break;
			}
			
		case 8:
			exchangeBookToBorrow(user);
			break;
		case 9:
			System.exit(0);
			break;

		default:
			break;
		}


	}
	public static void exchangeBookToBorrow(User user) {
		int x = 0;
		Book bChange = null;
		User user1 = null;
		
		for(Book book : user.toBorrowList) {
			if(bChange != null) {
				user.toBorrowList.remove(bChange);
				user1.wishList.remove(bChange);
				user1 = null;
				bChange = null;
			}
			for (User otherUser : usersSet) {
				for(Book bookOther :otherUser.wishList) {
					if((bookOther.getmAuthor().equals(book.getmAuthor())) && (bookOther.getmName().equals(book.getmName())) && (bookOther.getmType()==book.getmType()) && (x ==0)) {
						otherUser.setCount_of_borrow(otherUser.getCount_of_borrow()-1);
						user.setCount_of_give_book(user.getCount_of_give_book()+1);
						bChange = book;
						x = 1;
						user1 = otherUser;
						System.out.println("The book exchange");
						System.out.println(book);
					}
				}
			}
			saveUsers();
		}
		
		if(bChange != null) {
			user.toBorrowList.remove(bChange);
			user1.wishList.remove(bChange);
			user1 = null;
			bChange = null;
		}
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
		Book bChange = null;
		User user1 = null;
		for(Book book : user.wishList) {
			if(bChange != null) {
				user.wishList.remove(bChange);
				user1.toBorrowList.remove(bChange);
				user1 = null;
				bChange = null;
			}
			for (User otherUser : usersSet) {
				for(Book bookOther :otherUser.toBorrowList) {
					if((bookOther.getmAuthor().equals(book.getmAuthor())) && (bookOther.getmName().equals(book.getmName())) && (bookOther.getmType()==book.getmType()) && (x ==0)) {
						user.setCount_of_borrow(user.getCount_of_borrow()-1);
						otherUser.setCount_of_give_book(otherUser.getCount_of_give_book()+1);
						bChange = book;
						x = 1;
						user1 = otherUser;
						System.out.println("The book exchange");
						System.out.println(book);
					}
				}
			}
			saveUsers();
		}
		if(bChange != null) {
			user.wishList.remove(bChange);
			user1.toBorrowList.remove(bChange);
			user1 = null;
			bChange = null;
		}
	}
	public static int idGood(int id) {
		int x = 0;
		for (User otherUser : usersSet) {
			if ((otherUser.getId() == id) && (x == 0)) {
				x = 1;
				System.out.println("\nThis id already is already register\n");
			}
		}
		return x;
		
	}
	
	public static void loadUsers() {
		FileManager<User> fileM = new FileManager<User>("Users.txt");
		usersSet = fileM.read();
	}

	public static void saveUsers() {
		FileManager<User> fileM = new FileManager<User>("Users.txt");
		fileM.write(usersSet);
	}

	public static User signIn() {
		String UserName, Password, SecondPassword;
		int userId;
		boolean check;
		UserController userc = new UserController();
		do {
			System.out.println("Enter Id");
			userId = scanner.nextInt();
			System.out.println("Enter userName");
			UserName = scanner.next();
			do {
				System.out.print("Enter Password: ");
			    Password = scanner.next();
			    System.out.print("Repeat the password: ");
			    SecondPassword = scanner.next();
			}while(!Password.equals(SecondPassword));
			check = userc.SignIn(userId, UserName, Password);
			
		}while((idGood(userId) == 1) && (check == true));
	    return new User(UserName, Password, userId);

	}
	

	public static User logIn() {

		String UserName, Password;
		int Id;
		UserController userc = new UserController();
		
		User userCheck = null;
		System.out.println("Enter UserName: ");
		UserName = scanner.next();
		System.out.println("Enter Password: ");
		Password = scanner.next();
		System.out.println("Enter Id: ");
		Id = scanner.nextInt();
		
		loadUsers();
		

		for (User user : usersSet) {
			if (userc.SignIn(Id, UserName, Password ) == true)
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
