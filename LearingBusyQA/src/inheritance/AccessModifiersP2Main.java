package inheritance;
import accessmodifiers.AccessModifiersP1;

public class AccessModifiersP2Main {
	
	public static void main(String[] args) {
		AccessModifiersP1 A1=new AccessModifiersP1();
		
		System.out.print("Calling public method  outside pakage : ");
		A1.displaypublic();		
		System.out.println("Public variable accessed outside package :"+A1.publicv);
		
	///	A1.displayprotected(); try to access protected variable outside package
	//	System.out.print("Protected variable accessed outside package :"+A1.protect);.
		
		AccessModifiersP2 A2=new AccessModifiersP2();
		A2.dispaly2();
		
		
		//	A1.displaydefault(); try to access default variable outside package
		//	System.out.print("default variable accessed outside package :"+A1.defaultv);.
			
	}
}
