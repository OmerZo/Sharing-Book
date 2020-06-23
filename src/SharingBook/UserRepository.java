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

	@Override
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
