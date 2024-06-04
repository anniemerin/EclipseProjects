package assignment4;

public class Teacher {
	
	/*
	 * Create a class ‘Teacher’ which contains following variables and methods​
	 * designation = &quot;Teacher&quot;; ​ collegeName = &quot;BusyQA&quot;;​
	 * does() -&gt; Teaching​
	 * 
	 * Create another class ‘ComputerTeacher’ which extends ‘Teacher’ class then
	 * create objects then call methods.​
	 */
	
	String designation="Teacher";
	String collegeName="BusyQA";
	
	void does()
	{
		System.out.print("Teaching ");
	}

}

class ComputerTeacher extends Teacher	{
	
	void does ()
	{
		
		super.does();
		System.out.println("Computer Science");
	}
	
}