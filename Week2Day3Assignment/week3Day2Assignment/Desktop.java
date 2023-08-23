package week3Day2Assignment;

public class Desktop extends Computer {
	public void desktopSize(){
		System.out.println("desktopSize in this class");
	}
   public void computerModel() {
	   System.out.println("computerModel in this class");

}
	public static void main(String[] args) 
	{
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.desktopSize();
		
		}
		

	}


