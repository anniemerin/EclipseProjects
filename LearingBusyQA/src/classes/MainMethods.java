package classes;

public class MainMethods {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		System.out.println("I am in main with string args");
		main();
		main("srikant");
		
		int[] intArgs = {1, 2, 3};
		main(intArgs);
		//main(1);
	}
	
	public static void main(int[] args) 
	{
		// TODO Auto-generated method stub
		
		
		System.out.println("I am in main with int args");
		//main();
		//main("srikant");
	}
	
	public static void main() 
	{
		System.out.println("I am in main now");
		System.out.println("Ade exp");
	}
	
	public static void main(String args) 
	{
		System.out.println("I am with Srikant");
		main();

	}

}
