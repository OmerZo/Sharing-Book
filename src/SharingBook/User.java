package SharingBook;
import java.util.ArrayList;
import java.util.Scanner;


public class User {
	
	private ArrayList<Book> wishList = new ArrayList<Book>();
	private ArrayList<Book> ToBorrowList = new ArrayList<Book>(); 
	
	private String UserName;
	private String Password;
	private int id;
	
	private int Count_of_borrow;
	public ArrayList<Book> getWishList() {
		return wishList;
	}

	public void setCount_of_borrow(int count_of_borrow) {
		Count_of_borrow = count_of_borrow;
	}

	public void setCount_of_take_book(int count_of_take_book) {
		Count_of_take_book = count_of_take_book;
	}
	private int Count_of_take_book;	
	

	public int getCount_of_borrow() {
		return Count_of_borrow;
	}

	public int getCount_of_take_book() {
		return Count_of_take_book;
	}

	public void Add_User(ArrayList<Book> wishList,ArrayList<Book> ToBorrowList,String UserName,String Password,int id )
	{
		this.id = id;
		this.wishList = wishList;
		this.ToBorrowList= ToBorrowList;
		this.UserName=UserName;
		this.Password= Password;
		this.id=id;
		this.Count_of_borrow=0;
		this.Count_of_take_book=0;
		

		
	}
	
	public void Change(User wisher,User want_to_borrow, Book switchBook)
	
	{		//need to check if it work
		
		if(wisher.getCount_of_borrow()-wisher.getCount_of_take_book()<-3)
		{
			System.out.println("you can't borrow until you give to other books ");
			
		}
		else
		{
			System.out.println("It is a match ");
			System.out.println(wisher.wishList);
			wisher.wishList.remove(switchBook);
			want_to_borrow.ToBorrowList.remove(switchBook);
			System.out.println(want_to_borrow.wishList);
			want_to_borrow.setCount_of_borrow(Count_of_borrow +1);
			wisher.setCount_of_take_book(Count_of_take_book+1);
			System.out.println(wisher.wishList);
			System.out.println(want_to_borrow.wishList);
			System.out.println("check if it change");

		}
		
	}
	
	
	
	
	public static void add_detail_to_borrowList(User user,Book book_to_boroow)
	{
		
		ArrayList<String> ToBorrowListNew =  new ArrayList<>();
		
		
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	public User(String userName, String password, int id) {
		super();
		UserName = userName;
		Password = password;
		this.id = id;
	}
	
	
	
	
	public void setWishList(ArrayList<Book> wishList) {
		this.wishList = wishList;
	}
	public  ArrayList<Book> getToBorrowList() {
		return ToBorrowList;
	}
	public void setToBorrowList(ArrayList<Book> toBorrowList) {
		ToBorrowList = toBorrowList;
	}
	public User(ArrayList<Book> wishList, ArrayList<Book> toBorrowList) {
		super();
		this.wishList = wishList;
		this.ToBorrowList = toBorrowList;
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

	

}
