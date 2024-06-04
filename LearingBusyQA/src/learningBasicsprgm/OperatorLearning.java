package learningBasicsprgm;

public class OperatorLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithmetic Operator
		
		System.out.println("*****************Arithmetic Operator*****************");
		int a = 11;
		int b = 5;
		
		//Addition 
		int sum = a + b;
		System.out.println("Sum is: "+ sum);
		
		//substraction
		int diff = a - b;
		System.out.println("Difference is: "+ diff);
		
		//division
		int quo = a/b;
		System.out.println("Quo is: "+ quo);
		
		// '%' modulos
		int rem = a%b;
		System.out.println("Rem is: "+ rem);
		
		// ++ increment operator
		System.out.println("Initial value of A is : "+ a);
		System.out.println("Incrementing the value of A Pre Increment "+  ++a);
		System.out.println("Initial value of B is : "+ b);
		System.out.println("Incrementing the value of B Post Increment "+  b++);  // b = b+1 ==> b = 5+1 => b= 6 
		System.out.println("Incrementing the value of B Post Increment "+  b);
		
		// -- decrement operator
		System.out.println("Initial value of A is : "+ a);
		System.out.println("Decrementing the value of A Pre Decrement "+  --a);
		System.out.println("Initial value of B is : "+ b);
		System.out.println("Decrementing the value of B Post Decrement "+  b--);  // b = b-1 ==> b = 6-1 => b= 5
		System.out.println("Decrementing the value of B Post Increment "+  b);
		
		//Comparison Operators
		
		System.out.println("*****************Comparison Operators*****************");
		
		a = 6;
		b = 5;
		
		System.out.println("Initial value of A is : "+ a);

		System.out.println("Initial value of B is : "+ b);
		boolean isEqual = (a==b);
		boolean isNotEqual = (a!=b);
		boolean isGreaterThan = (a>b);
		boolean isLessThan = (a<b) ;
		boolean isGreaterOrEqual = (a >= b);
		boolean isLessOrEqual = (a <= b);
		
		System.out.println("condition value equals check: isEqual :" + isEqual);
        System.out.println("condition value equals check: isNotEqual :" + isNotEqual);
        System.out.println("condition value equals check: isGreaterThan :" + isGreaterThan);
        System.out.println("condition value equals check: isLessThan :" + isLessThan);
        System.out.println("condition value equals check: isGreaterOrEqual :" + isGreaterOrEqual);
        System.out.println("condition value equals check: isLessOrEqual :" + isLessOrEqual);
		
        
      //Logical Operator
		
       System.out.println("*****************Logical Operator*****************");
       	a = 6;
		b = 7;		
		int c = 4;
		
		//Logical And operator &&
		boolean logicalAnd = ((a>b) && (b>c)); 
		System.out.println("Logical value equals check: logicalAnd :" + logicalAnd);
		
		//Logical OR operator ||
		boolean logicalOR = ((a>b) || (b>c)); 
		System.out.println("Logical value equals check: logicalOR :" + logicalOR);
		
		boolean d = true;
		//boolean e = false;
		//boolean logicalAnd1 = (d && e);
		
		boolean logicalNot = (!d);
		System.out.println("Logical value equals check: logicalNot :" + logicalNot);
		
		//String Operator
		
		String abc = "Hello Busy World";
		String bcd = "Java Program";
		String finalstr = abc + bcd;
		System.out.println("final string value : "+ finalstr);
	}

}
