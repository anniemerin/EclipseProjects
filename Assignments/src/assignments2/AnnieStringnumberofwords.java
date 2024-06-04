package assignments2;

import java.util.Scanner;

public class AnnieStringnumberofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to count number of words in a sentence.​
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a senetnce to find the number of words");
		String str1= scanner.nextLine();
		int length=str1.length();
		
		System.out.println("Length: "+length);
		int i=0;
	//	int j=1;
	//	String str2="";
		int count=0;
		scanner.close();
		// Traverse through each character.
		
		for( i=0;i<length;i++)
		{
			
			// check if the current char is not space and check if the next char is space or it is last char in the sentence. 
			
			if((str1.charAt(i)!=' ') && (i == length - 1 || str1.charAt(i+1)==' '))
			{
				count ++;
			}
			//System.out.println("Value of i " +i +" "+str1.charAt(i));
		}
		
		System.out.println("Number of words: "+(count));

	}

}
