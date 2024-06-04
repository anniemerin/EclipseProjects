package assignments2;

import java.util.Scanner;

public class AnnieStringrepeatedchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to count number of time a character repeated in a string.​
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String str1 = scanner.nextLine();
		System.out.println("Enter the character that need to be searched");
		String ch=scanner.next();
		int count=0;
		scanner.close();		
		int length = str1.length();
		String str2 = "";
		int j = 1;
		int i=0;
		scanner.close();
		
		//Traverse through each chars
	
		  for ( i=0;i<length;i++) 
		  { 
			  str2=str1.substring(i, j);
			  
			  // compare each char in the string with the search character
			  if(str2.equalsIgnoreCase(ch))
				{
					count++;
				
				}
					 
			  j++;
		  }
		
			
		
		System.out.println("No. of time character "+ch+" repeated in the string: "+count);

	}

}
