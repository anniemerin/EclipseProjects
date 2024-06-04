package assignment3;

public class CalculationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a program to demonstrate constructor.Create a class ‘Calculation’ with 3 integer variables.​
		Create a constructor for assign the values into variables.​
		Then create another method ‘sum’ to calculate sum of 3 numbers.​
		Now, create object and call constructor by passing 3 integer values then call sum method.*/
		
		
		//create object and call constructor by passing 3 integer values then call sum method.
		
		Calculation calc =new Calculation(100,200,300);
		calc.sum();

	}

}
