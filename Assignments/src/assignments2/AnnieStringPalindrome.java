package assignments2;

import java.util.Scanner;

public class AnnieStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program to check a string is palindrome or not​ (e.g., reverse of &quot;level&quot; is &quot;level&quot;)
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String str1 = scanner.nextLine();
		int length = str1.length();
		String str2 = "";
		String str3 = "";
		scanner.close();	
		int j = 0;
		int i=0;
		
		// Reverse the string.
		  for ( i=(length-1);i>=0;i--) 
		  { 
			  str2=str1.substring(i, length-j);
			  str3=str3+str2;
			  j++;
		  }
		  
		  // Compare the entered string and reversed string
		  if(str1.equalsIgnoreCase(str3))
		  {	
			  System.out.println("Entered string is Paliandrome");
		  }else
		  {
			  System.out.println("Entered string is not Paliandrome");
		  }
		  
		
		

	}

}
