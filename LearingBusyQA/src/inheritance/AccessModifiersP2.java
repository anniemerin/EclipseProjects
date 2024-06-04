package inheritance;

import accessmodifiers.AccessModifiersP1;

public class AccessModifiersP2 extends AccessModifiersP1{
	
	public void dispaly1() 
	{
		System.out.print("Calling public method in subclass outside pakage : ");
		displaypublic();
		System.out.print("Public variable in subclass outside package :"+publicv);
	}
	
	protected void dispaly2() 
	{
		System.out.print("Calling protected method in subclass outside pakage : ");
		displayprotected();
		System.out.print("protected variable in subclass outside package :"+protect);
		
		
	}
	
	/*
	 * void display3() {
	 * System.out.print("Calling default method in subclass outside pakage : ");
	 * displaydefault();
	 * System.out.print("default variable in subclass outside package :"+defaultv);
	 * 
	 * }
	 */
	
	
	
	

}
