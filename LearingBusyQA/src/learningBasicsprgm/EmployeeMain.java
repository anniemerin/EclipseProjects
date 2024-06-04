package learningBasicsprgm;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeAT obj1 = new EmployeeAT(); 
		
		obj1.eid = 1;
		obj1.name = "Srikant";
		obj1.salary = 10000.91d ;
		obj1.jobtitle = "QA Engineer";
		
		EmployeeAT obj2 = new EmployeeAT(); 
		
		obj2.eid = 1;
		obj2.name = "Rajeswari";
		obj2.salary = 100560.91d ;
		obj2.jobtitle = "QA Tutor";
		
		obj2.display();
		
		obj1.display();

	}

}
