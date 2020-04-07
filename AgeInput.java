import java.util.Scanner;
public class AgeInput 

{
	public static void main(String[] args) 
	{
		Scanner agescan = new Scanner (System.in);
		
		int AgeNumber = 0;
		Boolean isInt;
		
		System.out.println("Please enter your age.");
		
		do 
		{
			if(agescan.hasNextInt())
			{
			isInt = true;
			}
			else
			{
				System.out.println("Not a valid age number. Please try again.");
				isInt = false;
				agescan.next();
				agescan.close();
			
			}
		}
		while (!(isInt));
		AgeNumber = agescan.nextInt();
		
		if(AgeNumber > 1 && AgeNumber < 50)
		{
			System.out.println("You are getting old.");
		}
		if(AgeNumber > 50 && AgeNumber < 100)
		{
			System.out.println("You are now old.");
		}
		if(AgeNumber > 100)
		{
			System.out.println("How are you still alive?");
		}
		if(AgeNumber == 0) 
		{
		System.out.println("If you are zero years old, how did you get here in the first place?");
		}
	}
}
