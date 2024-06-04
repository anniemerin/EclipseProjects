package assignment5;

public class ExceptionHandling3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionHandling3 eh=new ExceptionHandling3();
		
		try {
			
			eh.agecheck();
			
		} catch (InvalidAgeException e) {
			
			// TODO Auto-generated catch block
			
			System.out.println("Exception found\t"+e);
		}

	}

}
