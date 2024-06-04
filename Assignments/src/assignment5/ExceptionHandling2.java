package assignment5;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandling2 {

	
	void writeFile(String file_name) throws IOException
	{
		FileWriter writer=new FileWriter(file_name);
		writer.write("Code to test IO Exception");
		writer.close();
		throw new IOException("Specified file is not found");
	}
}
 