package SharingBook;

import java.util.Set;

public interface IUserRepository {

	void add(User user);

	void delete(int id);

	User find(int id);

	Set<User> findAll();

	User findByName(String name);
}
