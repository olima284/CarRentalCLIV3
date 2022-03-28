package com.careerdevs;
// car class w/ 3 properties: make, model, and year
//Car is a class it life object attributes :make model and year
//Make and model set as a string value they are objects
// Year set as int since the number will never be over 28b ;
public class Cars {


    private String make;
    private String model;
    private  int  year;
    private  String plateNum;
    private boolean isRented;


    //Constructor set initial values for object attributes
    //(getters and setters are methods) should be after constructors
    public Cars(String make, String model, int year, String plateNum, boolean isRented) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.plateNum = plateNum;

        this.isRented = isRented;
    }
//getter method returns the value of the attribute :sting int boolean
//setter method takes a parameter and assigns it to the attribute
//a getter method returns its value & setter method sets or updates its value
//By using the set method, you can be sure the value.
// This is much better than updating the variable directly each time
//
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
    public String getName() {
        return make + " " + model;
    }
    //@Override
//    public String toString(){
//        return "make= '" + make + '\'' +
//                ", model='" + model + '\'' +
//                ", year=" + year;
//
//}

    @Override
    public String toString() {
        return "Cars{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", plateNum='" + plateNum + '\'' +
                ", isRented=" + isRented +
                '}';
    }
}
/*
arry for car list
Car class that takes in a make, model, and a year.
Car class fields are declared as private.
**Be able to explain why this relates to encapsulation, one of our pillars of OOP.
**A constructor for your car class
Getters and Setters for your Car class. Be able to answer why do we use getters and setters.
Also, make sure you could code up a getter & setter on your own, not relying on the generate function!
 add a Dealership class
add property to our Car class plate number
*/
