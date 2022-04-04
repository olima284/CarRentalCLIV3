package com.careerdevs;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);





        Cars cars1 = new Cars("Honda", "Accord", (short) 2010, "AW246");
        Cars cars2 = new Cars("Chevy", "Cruze", (short) 2020, "MV235");
        Cars cars3 = new Cars("Toyota", "Corolla", (short) 2011, "TC784");
        Dealership Dealership1 = new Dealership("Liv's Auto Sales");

        Dealership1.getAvailableCars().add(cars1);
        Dealership1.getAvailableCars().add(cars2);
        Dealership1.getAvailableCars().add(cars3);

        System.out.println("Welcome" + " "+ Dealership1.getDealershipName());


        for (int i = 0; i < Dealership1.getAvailableCars().size(); i++) {
            System.out.println(Dealership1.getAvailableCars().get(i));
        }

        System.out.println("Please enter Plate Number of desired car : " );
            String userInput = scanner.nextLine();

            Dealership1.buyCars(userInput);

            System.out.println("You have Purchased: " + Dealership1.getSoldCars());

            System.out.println("Remaining Cars for sales: \n " + Dealership1.getAvailableCars());
       // test dealership name
      //System.out.println("Welcome" + " "+ dealership1.getDealershipName());
       // print:Liv's Auto Sales

      //test
        //System.out.println(dealership1.getAvailableCars().size());
       // Print: 3 car value
         }
    }



//tester
// System.out.println(cars1);

// Test getter
//System.out.println(cars1.getMake());

// and setter
//a new Dealership instance & giving it a name.
//** ArrayList **
//System.out.println(availableCarsArrayList.size());
// <<< Give you the value of availableCars **** size() is a method call

//availableCarsArrayList.add(car2);
//to add to car2 to available Cars Array List

//soldCarsArrayList.remove()
//remove item from array list call method @index or @object


//soldCarsArrayList.set(0, "car2")
//System.out.println(soldCarsArrayList.get(0))
//print: Chevy

//Print Array List
///System.out.println(soldCarsArrayList)

//get