package SharingBook;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Login {
	
	
	public void createFile() {

		
/*
		User user = new User("Ilan" , "password123", 123);
		ObjectOutputStream outputStream = null;
		
		try {
			String fileName = "Users.txt";
			outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
			
			
			outputStream.writeObject(user);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
*/

		try {
		      File file = new File("Users.txt");
		      if (file.createNewFile()) {
		        System.out.println("File created: " + file.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		
	}

	public void usingBufferedWritter(User user) 
	{	     
	    BufferedWriter writer;
		try {
			
			writer = new BufferedWriter(new FileWriter("Users.txt", true));
			
			writer.newLine();
			writer.write("UserName: " + user.getUserName());
			writer.newLine();
			writer.write("Password: " + user.getPassword());
			writer.newLine();
			writer.newLine();
	   
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
