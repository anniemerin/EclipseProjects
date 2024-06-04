package assignment5;

public class ExceptionHandling1 {
	
	/*
	 * 1. Write a java program for the following and handle exceptions by using
	 * try..catch and finally blocks. a) Any number divide by zero. b) int a[]=null;
	 * a.length c) arrayindexoutofbounds example
	 */
	
	int a[]=null;
	int len;
	int [] arr= {1,2,3};
	int div;
	int val;
	
	void division()
	{
		try {
			
			div=10/0;
			
		}catch (ArithmeticException e) {
			
			System.out.println("Exception found "+e);
			
		}finally {
			
			System.out.println("Arithmetic Exception handled successfully\n");
		}
	}
	
	void length()
	{
		try {
			
			len =a.length;
			
		} catch (NullPointerException e)	{
			
			System.out.println("Exception found "+e);
			
		}finally	{
			
			System.out.println("NullPointer Exception handled successfully\n");
			
		}
	}
	
	void arrayBound()
	{
		try {
			
			val= arr[3];
			
		} catch (ArrayIndexOutOfBoundsException e)	{
			
			System.out.println("Exception found "+e);
			
		}finally	{
			
			System.out.println("Array Index Out Of Bounds Exception handled successfully\n");
			
		}
	}

}
