package week3day3Assignment;

public  class Automation extends MultipleLangauge{
	
	

	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.python();
		obj.Ruby();
		obj.Selenium();
		obj.Java();

	}

	
	public void Selenium() {
		System.out.println("override selenium");
		
	}


	public void Java() {
		System.out.println("override Java");
		
	}

}
