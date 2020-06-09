package SharingBook;
public enum Type_book {

	Actiom(1),
	Drama(2),
	Fantasy(3),
	Horror(4);

	private int numVal;

	Type_book(int numVal) {
		this.numVal = numVal;
	}

	public int getNumVal() {
		return numVal;
	}
}