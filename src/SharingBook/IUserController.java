package SharingBook;

public interface IUserController {
	
	public boolean LogIn(int id , String userName, String Password,User usercheck);
	public boolean SignIn(int id, String userName, String Password);
	

}