package testers;

import java.util.Scanner;

public class MohammadPractice 
{
		
		public static void main(String[] args) 
		{
			System.out.println("Enter an age: ");
			//Reads inputs for console and defining the age
			Scanner age = new Scanner(System.in);
			//Making sure its a number and go to the next number
			int userage = age.nextInt();
			
			if(userage >= 0 && userage <=5)
			{
				System.out.println("baby");
			} 
			else if(userage >= 6 && userage <= 11)
			{
				System.out.println("kid");
			}
			else if(userage >=11 && userage <= 18) 
			{
				System.out.println("teen");
			}
			else if(userage >=18 )
			{
				System.out.println("adult");
			}
			else 
			{
				System.out.println("Invalid");
			}
		}
}