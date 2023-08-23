package org.student;

import org.department.department;

public class Student extends department {
	
     public void studentName() 
     {
	System.out.println("Pradeep");
	}
     public void collegeName()
 	{
 		System.out.println("Collegename in student package");
 	}
 	public void collegecode()
 	{
 		System.out.println("collegecode in student package");
 	}
 	public void collegeRank()
 	
 	{
 		System.out.println("collegeRank in student package");
 	}
 	public void department()
	{
		System.out.println("department in student package");
	}
	public static void main(String[] args) {
		
Student obj= new Student();
obj.studentName();
obj.collegeName();
obj.collegecode();
obj.collegeRank();
obj.department();

	}

}
