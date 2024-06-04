package assignment1;

import java.util.Scanner;

public class AnnieMultiplicaiontable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java to display the multiplication table of a given integer using for loop.​
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a valid number: ");
		int num=scanner.nextInt();
		scanner.close();
		for (int i=1; i<=20;i++)
		{
			int product=num*i;
			System.out.println(num+" * "+i+" = "+product);
		}
			
		

	}

}
