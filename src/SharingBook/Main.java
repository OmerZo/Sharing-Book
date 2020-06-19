package SharingBook;
import java.util.Scanner;
import java.util.ArrayList;




public class Main {
	
public static void add_detail_wishlist(ArrayList<Book> wishList)
{
	String mName,mAuthor, ifitis;
	System.out.println("Enter your wish 1 to stop enter 2 to enter new book");
    Scanner l = new Scanner(System.in);
    ifitis = l.next();
    while (ifitis.equals("2"))
    {
    	System.out.println("Enter name of book");
    	mName = l.next();
    	System.out.println("Enter author of the book");
    	mAuthor = l.next();
    	System.out.println("Enter the type of the book");
		Scanner s = new Scanner(System.in);
		int mType = s.nextInt();	
		Book NewBook = new Book(mName,mAuthor,mType);
		wishList.add(NewBook);
    	System.out.println("The book is insert");
    	System.out.println("Enter your wish 1 to stop enter 2 to enter new book");
    	ifitis = l.next();

    }
    

	
}


public static void add_detail_to_borrowList(ArrayList<Book> ToBorrowList)
{
	String mName,mAuthor, ifitis,i;
	System.out.println("Enter your wish 1 to stop enter 2 to enter new book");
    Scanner l = new Scanner(System.in);
    ifitis=l.next();
    while (ifitis.equals("2"))
    {
    	System.out.println("Enter name of book");
    	mName = l.next();
    	System.out.println("Enter author of the book");
    	mAuthor = l.next();
    	System.out.println("Enter the type of the book");
		Scanner s = new Scanner(System.in);
		int mType = l.nextInt();
		Book NewBook = new Book(mName,mAuthor,mType);
		ToBorrowList.add(NewBook);
    	System.out.println("The book is insert");
    	System.out.println("Enter your wish 1 to stop enter 2 to enter new book");
        ifitis=l.next();

    }
	
}


	public static void main(String[] args) {
		int numin, idnew, index=0, g=0;
		String Password, UserName, SecondPassword, d;
		
		ArrayList<Book> wishList= new ArrayList<>();
		ArrayList<Book> ToBorrowList =  new ArrayList<>();
		
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
			System.out.println("Repeat the password");
			SecondPassword=s.next();
			if (Password.equals(SecondPassword)) {
				index=1;
			}
			else
				g=1;
			
			add_detail_wishlist(wishList);
			add_detail_to_borrowList(ToBorrowList);


			User NewLogin= new User (wishList,ToBorrowList,UserName,Password,idnew);
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
