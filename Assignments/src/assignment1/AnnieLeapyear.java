package assignment1;

import java.util.Scanner;

public class AnnieLeapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year in YYYY format");
		int year=scanner.nextInt();		
		scanner.close();			
				if ((year %4==0))
				{				
					System.out.println("Entered year is: "+year+" and is a leap year");
				}else {
					System.out.println("Entered year is: "+year+" and is not a leap year");
				}			
				
		}
}

		

	