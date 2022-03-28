package com.careerdevs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dealership {
    Scanner scan = new Scanner(System.in);
    private static Scanner scanner = new Scanner(System.in);

    public static String readString(String question) {


        while (true){
            System.out.print(question + "\nInput: ");
            String inputString = scanner.nextLine();

            if ( !inputString.trim().equals("") ) {
                return inputString.trim();
            }
            System.out.println("You must enter something");
        }

    }

    public static int readInt(String question) {
        while (true) {
            try {
                System.out.print(question + "\nNumber: ");
                return scanner.nextInt(); //exception risk

            } catch ( InputMismatchException e){
                System.out.println("You must enter an integer, try again");
                scanner.nextLine();
            }

        }
    }
}





/*    String dealershipName;
    List<Car> availableCars;
    List<Car> soldCars
*/