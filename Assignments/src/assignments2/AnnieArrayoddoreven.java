package assignments2;

public class AnnieArrayoddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray={1,2,3,4,8,9,14};
		int size=intArray.length;
		for(int i=0; i<size;i++)
		{
			if((intArray[i]%2==0))
			{
				System.out.println(intArray[i]+" is an even number");
			}else
			{
				System.out.println(intArray[i]+" is an odd number");
			}
		}

	}

}
