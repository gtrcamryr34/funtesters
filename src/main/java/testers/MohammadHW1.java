package testers;
import java.util.Scanner;

public class MohammadHW1 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:" );
		Scanner user = new Scanner(System.in);
		int usernumber = user.nextInt();
		
		if(usernumber % 2 == 0) 
		{
			System.out.println(usernumber + " is even");
		}
		else 
		{
			System.out.println(usernumber + " is odd");
		}
	}	
}