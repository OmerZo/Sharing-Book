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


	@Override
	public boolean equals(Object book) {
		if (this == book)
			return true;
		if (book == null)
			return false;
		if (getClass() != book.getClass())
			return false;
		Book other = (Book) book;
		if (mAuthor == null) {
			if (other.mAuthor != null)
				return false;
		} else if (!mAuthor.equals(other.mAuthor))
			return false;
		if (mName == null) {
			if (other.mName != null)
				return false;
		} else if (!mName.equals(other.mName))
			return false;
		if (mType != other.mType)
			return false;
		return true;
	}

	public void setmType(int mType) {
		this.mType = mType;
	}
	
	
	@Override
	public String toString() {
		return "Book name = " + mName + ", Author = " + mAuthor + ", Type = " + mType;
	}

}
