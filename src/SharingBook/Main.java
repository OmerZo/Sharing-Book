package SharingBook;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello world!!");
		Book b1 = new Book("a", "b", 1);
		System.out.println("Book name = " + b1.getmName());
		User user = new User("Ilan" , "password123", 123);
	}

}
