package testers;

import java.util.Scanner;

public class ahmedExercise2 {

    public static void main(String args[]) {
        System.out.println("enter a number");
        Scanner number = new Scanner(System.in);
        int username = number.nextInt();


        if (username % 2 == 0) {
            System.out.println("The given number " + 2 + " is Even ");
        } else {
            System.out.println("The given number " + 1 + " is Odd ");
        }
    }
}