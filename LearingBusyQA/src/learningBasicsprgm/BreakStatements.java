package learningBasicsprgm;

public class BreakStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1 ;
		while (i<=10) { //1<=10 T, 2<=10 T... 5<=10T
			
			if(i==5) { //1==5 F, 5==5 T
				System.out.println("Break condition reached value of I is now: "+i);
				break;// if break is commented this will execute until 10;
			}
		
			System.out.println("Value of I is: "+i);
			i= i+1; //2 3  i++ == i= i+1 
		}
		
		System.out.print("Out of While Loop");
	}

}
