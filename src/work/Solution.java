package work;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final Scanner sc=new Scanner(System.in);
		for(int i=0;i<3; i++)
		{
			final String name=sc.nextLine();
			final BMW b=new BMW();
			
			if(name.equals("reverseGear"))
			{
				b.reverseGear();
			}else if(name.equals("switchOnHeadlights"))
			{
				b.switchOnHeadligths();
			}else if(name.equals("topSpeed"))
			{
				b.topSpeed();
			}else
			{
				System.out.println("Invalid Command");
			}
		}
	}

}

class BMW
{
void reverseGear()
{
System.out.println("BMW is reversing.");	
}

void switchOnHeadligths()
{
	System.out.println("BMW headlights are on.");
}
void topSpeed()
{
	System.out.println("BMW top speed is 250 kmph.");
}
}
