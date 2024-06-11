package midtermexam;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc=new Calculator();	
		ScientificCalculator sccalc=new ScientificCalculator();
		BasicCalculator basicCalc=new BasicCalculator();
			
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int num1=scanner.nextInt();
		System.out.println("Enter the second number: ");
		int num2=scanner.nextInt();
		System.out.println("Enter the operation to be performed : ");
		String operator=scanner.next();
		if (operator.equals("+"))
		{
			System.out.println("\nSum of the entered numbers : "+basicCalc.sum(num1, num2));
		}else if (operator.equals("-"))
		{
			System.out.println("Difference of the entered numbers : "+calc.difference(num1, num2));
		}else if (operator.equals("*"))
		{
			System.out.println("Product of the entered numbers : "+calc.multiplication(num1, num2));
		}else if (operator.equals("/"))
		{
			System.out.println("Value after division for the entered numbers : "+calc.division(num1, num2));
		}else
		{
			System.out.println("Invalid Operator");
		}
		
		
		System.out.println("\nSquare of first number : "+sccalc.findSquare(num1));
		System.out.println("Square of second number : "+sccalc.findSquare(num2));
		System.out.println("\nCube of first number : "+sccalc.findCube(num1));
		System.out.println("Cube of second number : "+sccalc.findCube(num2));
		
		scanner.close();

	}

}
