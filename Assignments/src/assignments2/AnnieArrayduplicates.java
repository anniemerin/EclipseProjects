package assignments2;

public class AnnieArrayduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program to find duplicate elements in an array.​
		
		int[] intArray= {1,2,3,9,4,8,9,14};
		int size=intArray.length;
				
		for (int i=0;i<size;i++)
		{
			for (int j=i+1; j<size;j++)
			{
				if(intArray[i]==intArray[j])
				{
					System.out.println("Duplicate element in array is: "+intArray[i]);
				} /*
					 * else { System.out.println("No duplicate element in array"); }
					 */
			}
		}
		
	}

}
