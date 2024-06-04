package classes;

public class StudentConstructorMain {
	
	public static void main(String[] args) {
	
	StudentConstructor s1 = new StudentConstructor(11,"Merin");
	StudentConstructor s2 = new StudentConstructor();
	
	s2.id=103;
	s2.name="Nathu";
	
	s1.display();
	s2.display();
	
	}

}
