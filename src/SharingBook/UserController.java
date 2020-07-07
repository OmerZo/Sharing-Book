package SharingBook;

public class UserController implements IUserController{
	private LoginService service;

	
	public UserController() {
		service = new LoginService();
	}
	@Override
	public boolean SignIn(int id, String userName, String Password) {

		if((id < 0) || (userName == null) || (Password == null) || (userName == "") || (Password == ""))
		{
			throw new IllegalArgumentException("somthing is not valid");
		}
		
		String session = service.Login(id, userName, Password);
		if (session != null) {
			System.out.println(session);
			return true;
		}
		
		return false;
		
	}
	

	@Override
	public boolean LogIn(int Id , String userName, String Password,User user) {
		
		if ((user.getId() == Id) && (user.getUserName().equals(userName)) && user.getPassword().equals(Password)) {
			return true;
		}
		return false;
		
	}


	

}
