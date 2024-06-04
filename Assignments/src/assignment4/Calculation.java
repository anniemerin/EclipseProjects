package assignment4;

public class Calculation implements InterfaceAdd, IntefaceMul {

	/*
	 * 2. Write a program for multiple inheritance by using interface.​ Interface A
	 * : int a, int b add()​ Interface B : int x, int y mul()​ Class Calculation :
	 * Implements methods from A and B interfaces.
	 */
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Sum of "+a+ " and "+b+" : "+(a+b));
		
	}
	
	
	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
		System.out.println("Product of "+x+ " and "+y+" : "+(x*y));
		
	}


}
