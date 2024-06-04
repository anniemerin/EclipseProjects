package assignments2;

public class AnnieArraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to calculate sum values of an array.​
		
		int[] intArray = {1, 2, 3, 4, 8, 9, 14};	
		int len= intArray.length;
		int sum=0;
		for(int i=0; i<len;i++)
		{
			sum=sum+intArray[i];
			//System.out.println("Sum of values of an array: "+sum);
			
		}
		System.out.println("Sum of values of the array: "+sum);

	}

}
