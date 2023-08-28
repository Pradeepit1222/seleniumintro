package Week3Day4Assignement;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String [] split=test.split("");
        for (int i = split.length-1; i >=0; i--) 
        {
			System.out.println(split[i]);
			
			if(i%2!=0)
			{
				System.out.println(split[i]);
			}
			
			}
		}
	}


