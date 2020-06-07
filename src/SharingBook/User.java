package SharingBook;

public class User {
	private Book [] wishList;
	private Book [] ToBorrowList;
	private String UserName;
	private String Password;
	private int Count_of_borrow;
	private int Count_of_take_book;	
	
	public Book[] getWishList() {
		return wishList;
	}
	public void setWishList(Book[] wishList) {
		this.wishList = wishList;
	}
	public Book[] getToBorrowList() {
		return ToBorrowList;
	}
	public void setToBorrowList(Book[] toBorrowList) {
		ToBorrowList = toBorrowList;
	}
	public User(Book[] wishList, Book[] toBorrowList) {
		super();
		this.wishList = wishList;
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
		Password = password;
	}
	

}
