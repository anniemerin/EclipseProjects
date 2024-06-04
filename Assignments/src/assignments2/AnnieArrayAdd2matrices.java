package assignments2;

import java.util.Scanner;

public class AnnieArrayAdd2matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Add two matrices using 2-dimensional array
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int rows = scanner.nextInt();
		System.out.println("Enter the number of columns: ");
		int columns = scanner.nextInt();
		
		int [][] intArray1 = new int[rows][columns];
		int [][] intArray2 = new int[rows][columns];
		int [][] addArray = new int[rows][columns];
	
		//{{1,2,3},{4,5,6}};;{{7,8,9},{10,11,12}}
		
		System.out.println("Enter the values in array 1");
		
		for(int i = 0; i< rows ; i++)
		{   
			
			
			for(int j = 0; j< columns ; j++) 
			{ 
				intArray1[i][j] = scanner.nextInt();  
			}										
		}	
		
		System.out.println("Enter the values in array 2");
		
		for(int i = 0; i< rows ; i++)
		{   
			
			
			for(int j = 0; j< columns ; j++) 
			{ 
				intArray2[i][j] = scanner.nextInt();  
			}										
		}
		
		// Add 2 matrices
		
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<columns;j++)
			{
				addArray[i][j]=intArray1[i][j]+intArray2[i][j];
				System.out.print(addArray[i][j]+",");
			}
			System.out.println("");
		}
		
		scanner.close();

	}

}


