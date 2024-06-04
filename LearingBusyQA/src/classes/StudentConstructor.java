package classes;

public class StudentConstructor {
	
	 int id;
	 String name;
	 
	 
	 StudentConstructor(int s_id, String s_name) {
		 id = s_id;  //id = 101
		 name = s_name; // name = "Mein"
	 	}
	 StudentConstructor()
	 {
		 
	 }
	 void display() {
		 System.out.println("name: "+ name);
		 System.out.println("id : "+ id);
		
	 }

}
