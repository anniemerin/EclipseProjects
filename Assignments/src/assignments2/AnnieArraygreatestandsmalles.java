package assignments2;

public class AnnieArraygreatestandsmalles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to find greatest and smallest element in an array.​
		
		int[] intArray= {1,4,2,8,14,3,9};
		int size=intArray.length;
		//int j=1;
		int numSmall=intArray[0];
		int numGreat=intArray[0];
		//int temp=intArray[1];
		for (int i=0;i<size;i++)
		{
					
			
			if((intArray[i]<=numSmall)) //1==1; 
			{
				numSmall=intArray[i]; //numSmall=1;
				
			}else if((intArray[i]>numGreat))  /// 4>1;8>4;14>8;
			{
				numGreat=intArray[i]; /// numGreat=4;8;14			
			
			}
			//temp=intArray[i+2]; // temp=2;temp=8
		}
		System.out.println("Greatest Number: "+numGreat);
		System.out.println("Smallest Number: "+numSmall);
		

	}

}
