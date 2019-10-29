package testers;

import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner num = new Scanner(System.in);


        int usernum = num.nextInt();

        if (usernum >= 2) {
            System.out.println("Even");
        } else {
            System.out.print("odd");
        }
    }
}