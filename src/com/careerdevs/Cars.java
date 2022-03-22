package com.careerdevs;
// car class w/ 3 properties: make, model, and year
//Car is a class it life object attributes :make model and year
//Make and model set as a string value they are objects
// Year set as int since the number will never be over 28b ;
public class Cars {

    private String make;
    private String model;
    private  int  year;
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
//Constructor set initial values for object attributes
    public Cars(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

}

