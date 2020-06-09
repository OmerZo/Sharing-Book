package SharingBook;

public interface IUserController {
	
	public User Login(int id,String userName);
	public boolean AddUser(User user);
	public boolean DeleteUser(int id);

}