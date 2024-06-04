package assignments2;

import java.util.Scanner;

public class AnnieConvertintegertostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a Java program to convert integer to string.
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the integer value that needs to be converted to string");
		int number= scanner.nextInt();
		scanner.close();
		//String str= "";
		//str1= str+number;
		String str1= String.valueOf(number);
		System.out.println("After converting to string: "+str1);
		
	}
		

}
