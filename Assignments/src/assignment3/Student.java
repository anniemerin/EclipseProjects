package assignment3;

public class Student {
	
	String SID;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;
	int Totalmarks;
	
	//Takes student details SID and Sname as parameters and assign them to variables.​
	
	void getStuData(String StID, String Stname)
	{
		SID=StID;
		Sname=Stname;
		
	}
	
	//Takes student marks as parameters and assign them to Sub1, Sub2, Sub3.​
	
	void getStuMarks(int Subj1,int Subj2, int Subj3)
	{
		
		Sub1=Subj1;
		Sub2=Subj2;
		Sub3=Subj3;
	}
	
	//Calculate total marks and print the student details with total marks.
	
	
	void totalMarks()
	{
		
		Totalmarks= Sub1+Sub2+Sub3;
		System.out.println(SID+"      	"+Sname+"      	"+Totalmarks);
	}
	
}
