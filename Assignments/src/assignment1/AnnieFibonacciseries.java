package assignment1;

public class AnnieFibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to print Fibonacci Series in the range of 1 to 50. Series: (1, 1, 2, 3, 5, 8, 13...).
		
		
		int firstnum=1;
		int num=0;		
		//int i=1;
		int fibsum=0; //1;0+1;1=1;2+1;3+2
		while(firstnum<=50)
		{
			System.out.print(firstnum+"," );//1,;
			fibsum=num+firstnum; // 1+0=1;
			
			num=firstnum;	//num=1;
			firstnum=fibsum;	//  firstnum=1;
			//i++;
		}
		
	}

}
