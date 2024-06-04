package assignments2;

import java.util.Scanner;

public class AnnieArrayAveragescore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a Java program to find the average score of two students in three papers using 2-dimensional
		array.*/

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of Students: ");
		int rows = scanner.nextInt();
		System.out.println("Enter the number of subjects: ");
		int columns = scanner.nextInt();
		
		int [][] intArray = new int[rows][columns];
		
		
		
		for(int i = 0; i< rows ; i++)
		{   
			System.out.println("Enter the Marks of Student"+(i+1));
			
			for(int j = 0; j< columns ; j++) 
			{ 
				intArray[i][j] = scanner.nextInt();  
			}										
		}									
		
		int sum=0;
		int avg=0;
		int count=0;
		
		for(int i=0;i<rows;i++)
		{
			for (int j=0;j<columns;j++)
			{
				sum=sum+intArray[i][j];
				//System.out.println("Sum: "+sum);
				count++;
			}
		}
		
		System.out.println("Sum: "+sum);
		//System.out.println("count: "+count);
		avg=sum/(count);
		
		System.out.println("Average: "+avg);
		
		scanner.close();
	}

}
