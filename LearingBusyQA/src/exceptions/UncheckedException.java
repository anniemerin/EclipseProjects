package exceptions;


public class UncheckedException {
int quo;
String nullp=null;
int len=0;
String str= "abc";
int parse=0;
int [] arr= {1,2,3};
int val=0;
	void division()
	{
		try {
			 quo=10/0;
			
		}
		catch (Exception e) {
			
			System.out.println("Exception message for division operation:"+e);
		}
		
	}
	
	void nullpointer()
	{
		try {
			
			len=nullp.length();
		}
		
		catch (Exception e) {
			
			System.out.println("Exception message for lenght of string :"+e);
		}
	}
	
	void numberException()
	{
		try {
			
			parse=Integer.parseInt(str);
		}
		catch (Exception e) {
			
			System.out.println("Exception message for conversion :"+e);
		}
	}
	
	void arrayBound()
	{
		
		try {
			
			val= arr[11];
		}
		catch (Exception e) {
			
			System.out.println("Exception message for conversion :"+e);
		}
	finally
	{
		System.out.println("I am finally block");
	}
		
	System.out.println("Unchecked exceptions executed successfully");
	}
}