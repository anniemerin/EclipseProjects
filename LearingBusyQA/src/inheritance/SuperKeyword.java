package inheritance;

public class SuperKeyword {

	int a=10;
	
	
	 SuperKeyword() { 
		 
		 System.out.println("Paren class constructor"); 
		 
	 	}
	 
	 void displayP1() { 
		 
		 System.out.println("Parent class Method1");
		 
		 }
	 
	 void displayP2() { 
		 
		 System.out.println("Parent class Method1");
		 
		 }
	
}

class FirstChild extends SuperKeyword {
//	int 	a=8;
	void displayF1 ()
	{
		
		System.out.println("A in the First child class: "+a);
		a=9;
		
	System.out.println("A in the First child classnnn: "+a);
		System.out.println("A in the Parent class: "+super.a);
		
	}
}

/*
 * class SecondChild extends SuperKeyword {
 * 
 * void displayP1 () {
 * 
 * super.displayP1(); super.displayP2();
 * 
 * System.out.println("Second child class Method");
 * 
 * }
 * 
 * }
 * 
 * class ThirdChild extends SuperKeyword {
 * 
 * ThirdChild () { super(); System.out.println("Third child class constructor");
 * } }
 */


 