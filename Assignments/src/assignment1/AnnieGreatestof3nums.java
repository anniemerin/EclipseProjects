package assignment1;

import java.util.Scanner;

public class AnnieGreatestof3nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the first number");
		a=scanner.nextInt();
		System.out.println("Enter the second number");
		b=scanner.nextInt();
		System.out.println("Enter the third number");
		c=scanner.nextInt();
		
		if((a>=b) && (a>c)) {
			System.out.println("Greatest of three numbers :"+a);
		
		}else if((b>=a)&& (b>c)){
			System.out.println("Greatest of three numbers :"+b);
		}else if((c>=a)&& (c>b)){
			System.out.println("Greatest of three numbers :"+c);
		}else if((a==b) && (a==c)) {
			System.out.println("All 3 numbers are same");
		}else {
			System.out.println("Greatest of three numbers :"+b);
		}
		scanner.close();
		
	}

}
