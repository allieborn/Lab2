package com.InClassLabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a number between 1 and 100:");
        Scanner scan = new Scanner(System.in);
        int userNum = scan.nextInt();

        if (userNum >= 1 && userNum < 101) {
            if (userNum % 2 != 0 && userNum < 60) {
                System.out.println(userNum + " odd");
            }
            if (userNum % 2 == 0 && userNum < 25) {
                System.out.println("Even and less than 25");
            }
            if (userNum % 2 == 0 && 26 < userNum && userNum < 60) {
                //is there a way to combine this range?
                System.out.println("Even");
            }
            if (userNum % 2 == 0 && userNum > 60) {
                System.out.println(userNum + "even");
            }
            if (userNum % 2 != 0 && userNum > 60) {
                System.out.println("Odd and over 60");
            }

        }


        else {
            System.out.println("You did not enter a valid number. Please re-enter a valid number between 1 and 100:");
            //continue;
            //is there a way to loop this back to repeat plan? DO WHILE LOOP WITH 'CONTINUE' should solve?
        }

    }
}