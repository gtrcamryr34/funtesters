package testers;

import java.util.Scanner;

public class bipuPractise {

    public static void main(String[] args) {

        System.out.println("Enter an age:");
        Scanner age = new Scanner(System.in);

        int userage = age.nextInt();

        if (userage >=0 && userage <=5) {
            System.out.println("baby");
        }else if (userage >=6 && userage<=11) {
            System.out.println("Kid");
        }else if (userage >=12 && userage<=17) {
            System.out.println("Teen");
        }else if (userage >=18) {
            System.out.println("Adult");
        } else {
            System.out.println("Invalid");
        }
        }


    }

