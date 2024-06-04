package assignment1;

import java.util.Scanner;

public class AnniePalindromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * //Write a Java program to check Number is Palindrome or not using while
		 * loop.​ (Reverse of 121 is 121, so it is palindrome)
		 */

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a valid number: ");
		int num=scanner.nextInt();
		int input=num;
		scanner.close();
		int mod=0;
		int reverse=0;	
		while(num!=0)
		{
			mod=num%10;	
			reverse=reverse*10+mod;	
			//System.out.println(reverse);
			num=num/10;			
		}
		if(input==reverse)
		{
			System.out.println("Number is Palindrome ");
		}else
		{
			System.out.println("Number is not Palindrome ");
		}
		

	}

}
