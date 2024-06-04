package assignments2;

import java.util.Scanner;

public class AnnieStringRemovewhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to remove white spaces in a string.​
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter string with space:");
		String str= scanner.nextLine();
		scanner.close();
		int length=str.length();
		int i=0;
		int j=1;
		String str1="";
		String str2="";
		
		// Traverse through each character
		for( i=0;i<length;i++)
		{
			str1=str.substring(i,j);
			//System.out.println("String substring:"+str1);
			
			// concatenate string when its not a space;
			if (str.charAt(i)!=' ')//!str1.equals(" "))
			{
				str2=str2+str1;
				//System.out.println("String aafter concat:"+str2);
			}
			j++;
		}
		
		System.out.println("String after removing spaces:"+str2);

	}

}
