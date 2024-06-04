package assignment3;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 =new Student();
		Student stu2=new Student();
		
		stu1.getStuData("S001", "Merin");
		stu2.getStuData("S002", "Nathania" );
		stu1.getStuMarks(70, 80, 90);
		stu2.getStuMarks(80,90,100);
				
		System.out.println("SID      	SName      	TotalMarks");
		
		stu1.totalMarks();
		stu2.totalMarks();
		

	}

}
