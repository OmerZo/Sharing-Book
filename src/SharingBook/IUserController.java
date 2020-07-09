package SharingBook;

public interface IUserController {
	
	public boolean SignIn(int id, String userName, String Password);
	public boolean GoodBook(String mName, String mAuthor, int mType);
	

}