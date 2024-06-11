package midtermexam;

import java.util.HashMap;

public class StudentGrades {
	HashMap<String,Double> hashMap=new HashMap<String,Double>();
	
	void addGrade(String studentName, Double grade)
	{
		hashMap.put(studentName, grade);
		
	}
	double getGrade(String studentName)
	{
		return hashMap.get(studentName);
		
	}
	
	void removeStudent(String studentName)
	{
		hashMap.remove(studentName);
	}
	
	void printAllGrades()
	{
		System.out.println(hashMap);
	}

}
