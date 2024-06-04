package exceptions;

public class UncheckedExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UncheckedException ex=new UncheckedException();	
		System.out.println("Quotient is :"+ex.quo);
		
		ex.division();
		System.out.println("\nLength of string : "+ex.len);
		ex.nullpointer();
		
		System.out.println("\nString after converting to integer : "+ex.nullp);
		ex.numberException();
		
		
		System.out.println("\nValue at the 4th position : "+ex.val);
		ex.arrayBound();

	}

}
