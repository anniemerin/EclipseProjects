package classes;

public class StudentMethod {
	
	 int id;
	 String name;
	 String course;
	 
	 void initiateValues(int s_id, String s_name, String s_course) {
		 id = s_id;  //id = 1
		 name = s_name; // name = "srikant"
		 course = s_course; // course = "Computer science"
	 }
	 
	 void display() {
		 System.out.println("name: "+ name);
		 System.out.println("id : "+ id);
		 System.out.println("Course : "+ course);
	 }
	 
}
