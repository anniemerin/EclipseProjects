package classes;

public class StaticKeyword {
	int empno;
	String ename;
	static int deptno=2;

	static void increment() {
		deptno++;
		
	}

	void assignVal(int emp, String Name) {
		empno = emp;
		ename = Name;
		deptno++;
	}

	void displayVal() {
		System.out.println("Emp Num is: "+ empno);
		System.out.println("ename is: "+ ename);
		System.out.println("deptno is: "+ deptno);
	}
	
}
