package classes;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		StaticKeyword emp1 = new StaticKeyword();
	emp1.assignVal(1, "Srikant");
	
	emp1.displayVal();
	
	StaticKeyword emp2 = new StaticKeyword();
	emp2.assignVal(2, "Kajal");
	
	//	emp1.displayVal();
	emp2.displayVal();
	
	StaticKeyword.deptno=5;
	System.out.println("--------------Value after changing the depNum-------------------------");
//	//uncomment the below for showing static variable update
	emp1.displayVal();
	emp2.displayVal();
//	
//	
	StaticKeyword.increment();
	System.out.println("--------------Value after changing the depNum-------------------------");
	//uncomment the below for showing static variable update
	emp1.displayVal();
	emp2.displayVal();
	}
}