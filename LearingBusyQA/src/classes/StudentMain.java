package classes;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentMethod s1 = new StudentMethod();
		StudentMethod s2 = new StudentMethod();
		
		
		s1.initiateValues(1, "Srikant", "Computer Science");
		s1.initiateValues(3, "Srikant Kumar", "Computer Testing Science");
		s1.display();
		
		s2.initiateValues(2, "Ade", "Automation");
		
		s2.display();
		

	}

}
