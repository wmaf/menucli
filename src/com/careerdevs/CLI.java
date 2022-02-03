package com.careerdevs;


import java.util.InputMismatchException;
import java.util.Scanner;

public class CLI {
    private static Scanner scanner = new Scanner(System.in);

    public static int readInt (String question, int min, int max){

        while (true) {
            try {
                System.out.println(question);
                System.out.println("Between:  "+ min + " and " + max +"");

                int userInt = scanner.nextInt();

                if (userInt >= min && userInt <= max) {
                    return userInt;
                }
                System.out.println("Number must be in this range ( " + min + "-" + max +")");
            } catch (InputMismatchException e){
                System.out.println("you must enter a whole number");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("An error occurred");
                System.out.println(e + "\n" + e.getMessage());
            }

        }

    }
}
