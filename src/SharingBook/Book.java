package SharingBook;

public class Book {
	private String mName = "";
	private String mAuthor = "";
	private String mType = "";
	
	
	
	public Book(String mName, String mAuthor, String mType) {
		super();
		this.mName = mName;
		this.mAuthor = mAuthor;
		this.mType = mType;
	}
	
	
	public String getmName() {
		return mName;
	}
	
	public void setmName(String mName) {
		this.mName = mName;
	}
	
	public String getmAuthor() {
		return mAuthor;
	}
	
	public void setmAuthor(String mAuthor) {
		this.mAuthor = mAuthor;
	}
	
	public String getmType() {
		return mType;
	}
	
	public void setmType(String mType) {
		this.mType = mType;
	}

	

}
