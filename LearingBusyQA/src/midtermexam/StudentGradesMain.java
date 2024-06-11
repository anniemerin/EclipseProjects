package midtermexam;

import java.util.Scanner;
//import java.util.HashMap;

public class StudentGradesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StudentGrades studGrades=new StudentGrades();
		studGrades.addGrade("Merin", 60.0);
		studGrades.addGrade("Annie", 70.0);
		studGrades.addGrade("Thomas", 80.0);
		System.out.println("Details Entered successfully");
		System.out.println("\nDetails of Students");
		studGrades.printAllGrades();
		
		System.out.println("\nEnter the name of student whose grade to be retrieved");
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		Double grade=studGrades.getGrade(string);
		System.out.println("Grade of "+string +": "+grade );
		
		System.out.println("\nEnter the name of student that needs to be deleted");
		
		String name=scanner.next();
		studGrades.removeStudent(name);
		
		System.out.println("\nGrade of Students after deletion");
		studGrades.printAllGrades();

		scanner.close();
		

	}

}
