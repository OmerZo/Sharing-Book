package SharingBook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	public ArrayList<Book> wishList;
	public ArrayList<Book> toBorrowList;

	private String UserName;
	private String Password;
	private int id;
	private int Count_of_borrow;
	private int Count_of_give_book;

	public User(String userName, String password, int id) {
		wishList = new ArrayList<Book>();
		toBorrowList = new ArrayList<Book>();
		UserName = userName;
		Password = password;
		this.id = id;
	}

	public User(ArrayList<Book> wishList, ArrayList<Book> toBorrowList, String userName, String password, int id,
			int count_of_borrow, int count_of_give_book) {
		super();
		this.wishList = wishList;
		this.toBorrowList = toBorrowList;
		UserName = userName;
		Password = password;
		this.id = id;
		Count_of_borrow = count_of_borrow;
		Count_of_give_book = count_of_give_book;
	}

	public User(ArrayList<Book> wishList, ArrayList<Book> toBorrowList, String userName, String password, int id) {
		super();
		this.wishList = wishList;
		this.toBorrowList = toBorrowList;
		UserName = userName;
		Password = password;
		this.id = id;
	}

	public int getCount_of_borrow() {
		return Count_of_borrow;
	}

	public int getCount_of_give_book() {
		return Count_of_give_book;
	}

	public void Add_User(ArrayList<Book> wishList, ArrayList<Book> ToBorrowList, String UserName, String Password,
			int id) {
		this.id = id;
		this.wishList = wishList;
		this.toBorrowList = ToBorrowList;
		this.UserName = UserName;
		this.Password = Password;
		this.id = id;
		this.Count_of_borrow = 0;
		this.Count_of_give_book = 0;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setCount_of_borrow(int Count_of_borrow) {
		this.Count_of_borrow = Count_of_borrow;
	}
	public void setCount_of_give_book(int Count_of_give_book) {
		this.Count_of_give_book = Count_of_give_book;
	}



	public void setWishList(ArrayList<Book> wishList) {
		this.wishList = wishList;
	}

	public ArrayList<Book> getToBorrowList() {
		return toBorrowList;
	}

	public void setToBorrowList(ArrayList<Book> toBorrowList) {
		this.toBorrowList = toBorrowList;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}
	

	public void addWishBook() {
		String name, author;
		int type;

		System.out.println("\n\nPlease enter book details");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name of book: ");
		name = scanner.next();
		System.out.print("Enter author of the book: ");
		author = scanner.next();
		System.out.println("For action book enter 1\nFor drama book press 2\nFor fantasy book press 3\nFor horror book press 4");
		type = scanner.nextInt();
		Book NewBook = new Book(name, author, type);
		wishList.add(NewBook);
		System.out.println("The book is insert to wish list");
	}

	public void addBorrowBook() {
		String name, author;
		int type;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n\nPlease enter book details");
		System.out.print("Enter name of book: ");
		name = scanner.next();
		System.out.print("Enter author of the book: ");
		author = scanner.next();
		System.out.println("For action book enter 1\nFor drama book press 2\nFor fantasy book press 3\nFor horror book press 4");
		type = scanner.nextInt();
		Book NewBook = new Book(name, author, type);
		toBorrowList.add(NewBook);
		System.out.println("The book is insert to borrow list");

	}

	@Override
	public String toString() {
		return "User [wishList=" + wishList + ", toBorrowList=" + toBorrowList + ", UserName=" + UserName
				+ ", Password=" + Password + ", id=" + id + ", Count_of_borrow=" + Count_of_borrow
				+ ", Count_of_take_book=" + Count_of_give_book + "]";
	}
}
