package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptions {
	
	 public String readFile(String filename) throws FileNotFoundException {
		 
		 
	        File file = new File(filename);
	        Scanner scanner = new Scanner(file);
	        StringBuilder content = new StringBuilder();
	        
	        while (scanner.hasNextLine()) 
	        {
	            content.append(scanner.nextLine()).append("\n");
	        }
	        
	        scanner.close();
	        
	        return content.toString();
	        
	    }
}
