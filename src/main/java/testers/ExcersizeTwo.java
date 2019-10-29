package testers;

import java.util.Scanner;

public class ExcersizeTwo {

        public static void main(String[] args) {


            int num = 0;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a number:");

            num = sc.nextInt();

            if(num / 2 == 0)
                System.out.println("It is an even number.");
            else
                System.out.println("It is an odd number.");

}}
