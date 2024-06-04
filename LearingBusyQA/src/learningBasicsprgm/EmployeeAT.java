package learningBasicsprgm;

public class EmployeeAT {
	
	int eid;
	String name;
	double salary;
	String jobtitle;
	
	void display() {
		System.out.println(eid);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(jobtitle);
	}
	
	void bonus() {
		System.out.println((salary * 10)/100);
	}

}
