package assignments2;

import java.util.Scanner;

public class AnnieStringbetween2positions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to get a substring of a given string between two specified positions​
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter string");
		
		String str1=scanner.nextLine();
		
		System.out.println("Enter start index");
		int startIndex= scanner.nextInt();
		
		System.out.println("Enter end index");
		int endIndex= scanner.nextInt();
		scanner.close();
		
		String str2= str1.substring(startIndex,endIndex);
		
		System.out.println("Subsstring of the given string: "+str2);

	}

}
