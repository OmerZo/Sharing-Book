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
	public boolean ValidBook(String mName, String mAuthor, int mType) {
		int x =1;
		FileManager<User> fileM = new FileManager<User>("Users.txt");
		users = fileM.read();
		for (User checkUser : users) {
			if ((mName != null) && (mName != "") && (mType >= 1) && (mType <= 4) && (mAuthor != null) && (mAuthor != "")) {
				x = 0;
			}
		}
		if( x == 0) {
			return true;
		}
		return false;
		
	}

	
	public void add(User user) {
		this.fileManager.write(this.users);
		
	}

	@Override
	public void delete(int id) {
		
	}

	@Override
	public User find(int id) {
		return null;
	}

	@Override
	public Set<User> findAll() {
		return null;
	}

	@Override
	public User findByName(String name) {
		
		return null;
	}

}
