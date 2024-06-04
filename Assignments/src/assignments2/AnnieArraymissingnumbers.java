package assignments2;

public class AnnieArraymissingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] intArray={1,2,3,4,8,9,14};
		int sizeintArray=intArray.length;
		int[] newArray={1,2,3,4,9,14};
		int sizenewArray=newArray.length;
		int sumintArray=0;
		int sumnewArray=0;
		System.out.print("First array is: ");
		
		for (int i=0;i<sizeintArray;i++)
		{
			System.out.print(intArray[i]+" ");
			sumintArray=intArray[i]+sumintArray;
		}
		System.out.print("\nSecond array is: ");
		for(int i=0; i<sizenewArray;i++)
		{
			System.out.print(newArray[i]+" ");
			sumnewArray=sumnewArray+newArray[i];
		}
		System.out.print("\nMissing number in the array is: "+(sumintArray-sumnewArray));
	}

}
