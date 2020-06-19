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
	private int Count_of_take_book;

	public User(String userName, String password, int id) {
		wishList = new ArrayList<Book>();
		toBorrowList = new ArrayList<Book>();
		UserName = userName;
		Password = password;
		this.id = id;
	}

	public User(ArrayList<Book> wishList, ArrayList<Book> toBorrowList, String userName, String password, int id,
			int count_of_borrow, int count_of_take_book) {
		super();
		this.wishList = wishList;
		this.toBorrowList = toBorrowList;
		UserName = userName;
		Password = password;
		this.id = id;
		Count_of_borrow = count_of_borrow;
		Count_of_take_book = count_of_take_book;
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

	public int getCount_of_take_book() {
		return Count_of_take_book;
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
		this.Count_of_take_book = 0;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void add_detail_wishlist() {
		String mName, mAuthor, ifitis;
		System.out.println("Enter your wish 1 to stop enter 2 to enter new book");
		Scanner scanner = new Scanner(System.in);
		ifitis = scanner.next();
		while (ifitis.equals("2")) {
			System.out.println("Enter name of book");
			mName = scanner.next();
			System.out.println("Enter author of the book");
			mAuthor = scanner.next();
			System.out.println("Enter the type of the book");
			int mType = scanner.nextInt();
			Book NewBook = new Book(mName, mAuthor, mType);
			wishList.add(NewBook);
			System.out.println("The book is insert to wish list");
			System.out.println("Enter your wish 1 to stop enter 2 to enter new book");
			ifitis = scanner.next();

		}

	}

	public void add_detail_to_borrowList() {
		String mName, mAuthor, ifitis;
		System.out.println("Enter your wish 1 to stop enter 2 to enter new book");
		Scanner scanner = new Scanner(System.in);
		ifitis = scanner.next();
		while (ifitis.equals("2")) {
			System.out.println("Enter name of book");
			mName = scanner.next();
			System.out.println("Enter author of the book");
			mAuthor = scanner.next();
			System.out.println("Enter the type of the book");
			int mType = scanner.nextInt();
			Book NewBook = new Book(mName, mAuthor, mType);
			toBorrowList.add(NewBook);
			System.out.println("The book is insert to borrow list");
			System.out.println("Enter your wish 1 to stop enter 2 to enter new book");
			ifitis = scanner.next();

		}

	}

	
	@Override
	public String toString() {
		return "User [wishList=" + wishList + ", toBorrowList=" + toBorrowList + ", UserName=" + UserName
				+ ", Password=" + Password + ", id=" + id + ", Count_of_borrow=" + Count_of_borrow
				+ ", Count_of_take_book=" + Count_of_take_book + "]";
	}
}
