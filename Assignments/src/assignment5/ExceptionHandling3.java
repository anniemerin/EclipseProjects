package assignment5;

public class ExceptionHandling3 {
	
	int age=-1;
	
	void agecheck ()  throws InvalidAgeException
	{
		
			if (age<0)
			{
				throw new InvalidAgeException("Age cannot be negative");
			
			}else {
			
				System.out.println("No exception found");
			}
		
	}

}
