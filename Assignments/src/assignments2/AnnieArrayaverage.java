package assignments2;

public class AnnieArrayaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to calculate average of values of an array.​
		
		int[] intArray= {1,2,3,4,8,9,14};
		int sum=0;
		int avg=0;
		int len= intArray.length;
		for(int i=0;i<len;i++)
		{
			sum=sum+intArray[i];
		}
		avg=sum/len;
		System.out.println("Average of values in the array: "+avg);

	}

}
