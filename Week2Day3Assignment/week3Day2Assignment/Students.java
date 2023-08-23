package week3Day2Assignment;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("Student Id - "+id);
	}
   
	public void getStudentInfo (int id,String name)
	{
		System.out.println("Student Id - "+id);
		System.out.println("Student name - "+name);
	}
	public void getStudentInfo (long phoneno,String email)
	{
		System.out.println("phone no - "+phoneno);
		System.out.println("Student name - "+email);
	}
	
	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentInfo(50);
		obj.getStudentInfo(50, "Pradeep");
		obj.getStudentInfo(999445566, "Pradeep@gmail.com");

	}

}
