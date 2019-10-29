package testers;

import java.util.Scanner;

// boolern practice if is true and else is false\\
public class ahmedpractice {
    public static void main(String[] args) {
        System.out.println("enter an age: ");
        Scanner age = new Scanner(System.in);
        int userage = age.nextInt();

        if (userage >= 0 && userage <= 5) {
            System.out.println("baby");
        } else if (userage >= 5 && userage <= 11) {
            System.out.println("kid");
        } else if (userage >= 12 && userage <= 17) {
            System.out.println("Teen");
        } else if (userage >= 18) {
            System.out.println("adult");
        }
        else
            {
            System.out.println("invalid");
        }
    }
}
