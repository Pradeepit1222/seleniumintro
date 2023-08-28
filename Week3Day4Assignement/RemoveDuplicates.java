package Week3Day4Assignement;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String input="We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] spl=input.split(" ");
		for (int i = 0; i < spl.length-1; i++)
		{
			for (int j = i+1; j < spl.length; j++)
			{
				if(spl[i].equalsIgnoreCase(spl[j]))
						
					spl[j]="";
				
			}
		}
				for(int k=0;k<spl.length;k++) {
					System.out.print(spl[k]+" ");
			}
			
		}
		

	}
	

		

