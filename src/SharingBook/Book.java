package SharingBook;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	private String mName = "";
	private String mAuthor = "";
	public int mType;

	public Book(String mName, String mAuthor, int mType) {
		super();
		this.mName = mName;
		this.mAuthor = mAuthor;
		this.mType = mType;

		// need to add to the file
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
	
	
	@Override
	public String toString() {
		return "Book [mName=" + mName + ", mAuthor=" + mAuthor + ", mType=" + mType + "]";
	}

}
