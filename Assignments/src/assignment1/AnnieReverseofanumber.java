package assignment1;

import java.util.Scanner;

public class AnnieReverseofanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to reverse a number using while loop.​
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a valid number: ");
		int num=scanner.nextInt();
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
		System.out.println("Reverse of the number: "+reverse);
	}

}
