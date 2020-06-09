package SharingBook;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Login {
	public void run() {
		
		User user = new User("Ilan" , "password123", 123);
		
		try {
			String fileName = "Users.txt";
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
			
			
			outputStream.writeObject(user);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
		
		
/*		
	    Scanner keyboard = new Scanner (System.in);
	    String user = scan.nextLine();
	    String pass = scan.nextLine(); 

	    String inpUser = keyboard.nextLine();
	    String inpPass = keyboard.nextLine(); 

	    if (inpUser.equals(user) && inpPass.equals(pass)) {
	        System.out.print("your login message");
	    } else {
	        System.out.print("your error message");
	    }
*/
	}
}
