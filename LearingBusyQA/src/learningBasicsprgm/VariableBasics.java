package learningBasicsprgm;

public class VariableBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15; //4 bytes
		byte kid = 127; //1 bytes
		short babies = 3111; //2 bytes
		long bigNumber = 78787978; //8 bytes
		
		 System.out.println("Value of the kid variable is: "+ kid );
		 System.out.println("Value of the age variable is: "+ age );
		 System.out.println("Value of the babies variable is: "+ babies );
		 System.out.println("Value of the bigNumber variable is: "+ bigNumber );
		 
		boolean val = true;
		boolean negVal = false;
			
		System.out.println("boolean value: "+val);
		System.out.println("boolean negative value: "+negVal);
		
		float flotnum = 15.00f; // 4 bytes
		double doublenum = 20.00d; // 8 bytes
		
		System.out.println("The float number value in the flotnum variable is: " + flotnum);
		System.out.println("The double number value in the doublenum variable is: " + doublenum);
		String name = "Asdfsdf";
		
		System.out.println("The name value in the name variable is: " + name);		
		char character = 'A';		
		System.out.println("The charcter value in the character variable is: " + character);
	}
	

}
