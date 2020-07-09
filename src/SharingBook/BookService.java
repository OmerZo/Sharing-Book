package SharingBook;

import java.util.UUID;


public class BookService {
    private UserRepository log;
	
	public BookService() {
		log = new UserRepository();
	}
	public String Book(String mName, String mAuthor, int mType) {
		
		if (this.log.ValidBook(mName, mAuthor, mType)) {
			return UUID.randomUUID().toString();
		}
		return null;
	}

}
