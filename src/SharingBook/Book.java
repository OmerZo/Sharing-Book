package SharingBook;

public class Book {
	private String mName = "";
	private String mAuthor = "";
	public int mType ;
	
	
	
	public Book(String mName, String mAuthor, int mType) {
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
	
	public int getmType() {
		return mType;
	}
	
	public void setmType(int mType) {
		this.mType = mType;
	}

	

}
