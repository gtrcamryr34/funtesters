package testers;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args){
        System.out.println("enter a number");
        Scanner number = new Scanner(System.in);
        int X = number.nextInt();
        if ( X % 2==0) {
            System.out.println("This is a even Number");

        }else System.out.println("This is a odd Number");
    }
}
