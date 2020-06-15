package SharingBook;
import java.io.Serializable;
import java.util.ArrayList;


public class User implements Serializable {
	
	private ArrayList<Book> wishList = new ArrayList<Book>();
	private ArrayList<Book> ToBorrowList = new ArrayList<Book>(); 
	
	private String UserName;
	private String Password;
	private int id;
	
	private int Count_of_borrow;
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
	
	public User(ArrayList<Book> wishList, ArrayList<Book> toBorrowList, String userName, String password, int id,
			int count_of_borrow, int count_of_take_book) {
		super();
		this.wishList = wishList;
		ToBorrowList = toBorrowList;
		UserName = userName;
		Password = password;
		this.id = id;
		Count_of_borrow = count_of_borrow;
		Count_of_take_book = count_of_take_book;
	}
	
	
	public void setWishList(ArrayList<Book> wishList) {
		this.wishList = wishList;
	}
	public ArrayList<Book> getToBorrowList() {
		return ToBorrowList;
	}
	public void setToBorrowList(ArrayList<Book> toBorrowList) {
		ToBorrowList = toBorrowList;
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
