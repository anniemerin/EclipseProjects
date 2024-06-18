package assignments;

import java.util.Scanner;

public class Assignment1Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Assignment1 assignment1=new Assignment1();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Choose a testcase from the following list to run");
		System.out.println("TestCase1, TestCase2, TestCase3, TestCase4");
		String testcase=scanner.next();
		
		switch(testcase) {
		
		case "TestCase1":
			assignment1.TestCase1();
			break;
			
		case "TestCase2":
			assignment1.TestCase2();
			break;
			
		case "TestCase3":
			assignment1.TestCase3();
			break;
			
		case "TestCase4":
			assignment1.TestCase4();
			break;
			

		default:
			System.out.println("Invalid selection");					
		}
		
		scanner.close();
	}

}
