package assignment1;

import java.util.Scanner;

public class AnnieFactorialofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java Program to print factorial of a given number using any loop.

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a valid number: ");
		int num=scanner.nextInt();
		int count=(num-1);
		int fact=num;
		scanner.close();
		while (count!=0)
		{
			
			fact=fact*count;
			count--;
		}
		System.out.println("Factorial of "+ num+": "+fact);
	}

}
