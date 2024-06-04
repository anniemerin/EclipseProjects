package assignments2;

import java.util.Scanner;

public class AnnieStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to reverse a string.​

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a sring");
		String str1 = scanner.nextLine();
		int length = str1.length();
		String str2 = "";
		String str3 = "";
		int j = 0;
		int i=0;
		scanner.close();
	
		  for ( i=(length-1);i>=0;i--) 
		  { 
			  str2=str1.substring(i, length-j);
			  str3=str3+str2;
					 
			  j++;
		  }
		
		  System.out.println("Reverse of the given string: "+str3);
		
	}

}
