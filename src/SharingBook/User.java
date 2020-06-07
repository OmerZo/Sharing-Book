package SharingBook;

public class User {
	private Book [] wishList;
	private Book [] ToBorrowList;
	
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
	

}
