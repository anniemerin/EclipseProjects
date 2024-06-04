package assignment1;

import java.util.Scanner;

public class AnniePositiveorNegaivenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a number");
		int num=scanner.nextInt();
		if (num>0) {
			System.out.println("Number entered is " +num+" and is positive ");			
		}else if(num<0) {
			System.out.println("Number entered is " +num+" and is negative ");		
		}else {
			System.out.println("Number entered is " +num);	
		}			
		scanner.close();

	}

}
