package exceptions;

import java.io.FileNotFoundException;

public class CheckedExceptionsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CheckedExceptions ce = new CheckedExceptions();
	      
		try 
		{
	            String content = ce.readFile("nonexistentfile.txt");
	            System.out.println("File content: \n" + content);
	     }
		
		catch (FileNotFoundException e)
		{
	            System.out.println("File not found: " + e);
	    }
		
	}

	

}
