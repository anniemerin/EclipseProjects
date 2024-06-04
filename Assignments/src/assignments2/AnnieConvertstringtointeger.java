package assignments2;

import java.util.Scanner;

public class AnnieConvertstringtointeger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to convert string to integer.​
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scanner.nextLine();
		int number=Integer.parseInt(str);
		System.out.println("String after converted to integer: "+number);
		System.out.println("Multiply the converted integer to test if string is converted:"+(number*2));
		scanner.close();

	}

}
