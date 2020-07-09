package SharingBook;

public class UserController implements IUserController{
	private LoginService service;
	private BookService serviceBook;

	
	public UserController() {
		service = new LoginService();
		serviceBook = new BookService();
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
	public boolean GoodBook(String mName, String mAuthor, int mType) {
		
		if((mType < 1) || (mType > 4) || (mName == null) || (mName == "") || (mAuthor == null) || (mAuthor == "")) {
			throw new IllegalArgumentException("somthing is not valid");

		}
		
		String session = serviceBook.Book(mName, mAuthor, mType);
		if (session != null) {
			System.out.println(session);
			return true;
		}
		
		return false;
	}


	

}
