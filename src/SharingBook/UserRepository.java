package SharingBook;

import java.util.Set;

public class UserRepository implements IUserRepository {
	
	private final String FILENAME = "users";
	private Set<User> users;
	private FileManager<User> fileManager;
	
	public UserRepository() {
		this.fileManager = new FileManager<User>(FILENAME);
		this.users = this.fileManager.read();
	}
	
	public boolean ValidUser(int Id , String UserName, String Password) {
		FileManager<User> fileM = new FileManager<User>("Users.txt");
		users = fileM.read();
		for (User checkUser : users) {
			if ((checkUser.getId() == Id) && (checkUser.getUserName().equals(UserName)) && (checkUser.getPassword().equals(Password))){
				return true;
				
			}
		}
		return false;
	}

}
