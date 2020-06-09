package SharingBook;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int numin, idnew, index=0, g=0;
		String Password, UserName, SecondPassword;
		
		User login;
		ArrayList<String> wishList;
		ArrayList<String> ToBorrowList;
		
		System.out.println("Welcome to Sharing Book");
		System.out.println("If you want to sign in enter 1 to log in enter 2 ");
		Scanner s = new Scanner(System.in);
		numin = s.nextInt();
		
		while ((numin==1)&&(index==0))
		{
			if(g==1)
			{
				System.out.println("Wrong password enter details again");

			}
			System.out.println("Enter Id");
			idnew=s.nextInt();
			System.out.println("Enter UserName");
			UserName = s.next();
			System.out.println("Enter Password");
			Password = s.next();
			System.out.println("repeat the password");
			SecondPassword=s.next();
			if (Password.equals(SecondPassword)) {
				index=1;
			}
			else
				g=1;
			
			
			//login.Add_User(wishList, ToBorrowList, UserName, Password, id);


			
			


		}
		
		
		
		Book b1 = new Book("a", "b", 1);
		System.out.println("Book name = " + b1.getmName());
	}

}
