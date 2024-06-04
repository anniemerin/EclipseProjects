package learningBasicsprgm;

import java.util.Scanner;

public class IfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				System.out.println("Enter a number:");
				Scanner scanner = new Scanner(System.in);
				int number = scanner.nextInt();
				scanner.close();	
//				//simple if statement
				if (number > 5) {  //6>5 T  //4>5 F
					System.out.println("Number entered is greater than 5");
				}
				
//				// if-else statement		
				if (number > 5) {  //6>5 T  //4>5 F
					System.out.println("Number entered is greater than 5");
				}
				else {
					System.out.println("Number is less than or equal to 5");
				}
		// else if ladder 
				
				if (number < 0) {
					System.out.println("Number is negative");
				} else if (number == 0) {
					System.out.println("Number is Zero");
				} else if (number <10 ) {
					System.out.println("Number is Single Digit");
				} else if (number <100 ) {
					System.out.println("Number is Double Digit");
				} else {
					System.out.println("Number is Triple Digit");
				}
			
		
	}

}
