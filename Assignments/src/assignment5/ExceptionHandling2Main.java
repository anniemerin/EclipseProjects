package assignment5;


public class ExceptionHandling2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionHandling2 eh=new ExceptionHandling2();
		
		String filename="file.txt";
		
		try {
			
			eh.writeFile(filename);
			System.out.println("File successfully written.");
			
		} catch (Exception e) {
		
			System.out.println("Exception Found: "+e);
		}

	}

}
