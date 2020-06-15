package SharingBook;
import java.util.Scanner;
import java.util.ArrayList;




public class Main {
	
public static void detail_wishlist(String d,ArrayList<String> wishList)
{
	while(!d.equals("1"))
	{
		wishList.add(d);
		System.out.println("Enter your wish list until 1");
		Scanner l = new Scanner(System.in);
		d=l.next();


	}
}

	public static void main(String[] args) {
		int numin, idnew, index=0, g=0;
		String Password, UserName, SecondPassword, d;
		
		ArrayList<String> wishList= new ArrayList<>();
		ArrayList<String> ToBorrowList =  new ArrayList<>();
		
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
			System.out.println("Enter your wish list until 1");
			d=s.next();
			detail_wishlist( d, wishList);
			System.out.println(wishList);
			System.out.println("Enter your to borrow list until 1");
			d=s.next();
			while(!d.equals("1"))
			{
				ToBorrowList.add(d);
				System.out.println("Enter your wish list until 1");
				d=s.next();

			}

			System.out.println("Enter UserName");
			UserName = s.next();
			System.out.println("Enter Password");
			Password = s.next();
			System.out.println("Repeat the password");
			SecondPassword=s.next();
			if (Password.equals(SecondPassword)) {
				index=1;
			}
			else
				g=1;
			
			
			//login.Add_User(wishList, ToBorrowList, UserName, Password, idnew);


			User NewLogin= new User (UserName,Password,idnew);
			wishList.add(d);
			System.out.println(NewLogin.getId());
			
            Login log = new Login();
		    log.createFile();
		    log.usingBufferedWritter(NewLogin);
		

		}
		//else
		{
			
		}
		
		
		
		
	}

}
