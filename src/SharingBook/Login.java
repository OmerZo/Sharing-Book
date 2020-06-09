package SharingBook;
import java.util.Scanner;

public class Login {
	public void run() {
	    Scanner scan = new Scanner (new File("the\\dir\\myFile.extension"));//here
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
	}
	//do file with the details and put the Nfile here

}
