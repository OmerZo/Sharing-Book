package SharingBook;

import java.util.UUID;

public class LoginService {
	private UserRepository log;
	
	public LoginService() {
		log = new UserRepository();
	}
	public String Login(int Id , String UserName, String Password) {
		if (this.log.ValidUser(Id, UserName, Password)) {
			return UUID.randomUUID().toString();
		}
		return null;
	}
	

}
