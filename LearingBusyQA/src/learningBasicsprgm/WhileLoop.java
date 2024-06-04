package learningBasicsprgm;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		
		while(i<=10) { //1<=10 T, 2<=10 T, 3<=10 T, 4 
			System.out.println("Value of i: "+ i);
			i++; //2 , 3
		}

	
	
	// Print a series -> starting from 1 till 10
			// display 1 2 3 4 5 6 7 8 9 10
			 i = 11;
			System.out.println("While Loop");
			while(i<=10) { //1<=10 T, 2<=10 T, 3<=10 T, 4 
				System.out.println("Value of i: "+ i);
				i++; //2 , 3
			}
		
			System.out.println("Do While Loop");
			i = 1;
			// in do - while loop all the statments in the do block is executed atleast 1 time
			do {
				System.out.println("Value of i: "+ i);
				i++; 
			} while (i <= 10);
	}

}
