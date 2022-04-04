package com.careerdevs;


import java.util.ArrayList;
import java.util.List;

public class Dealership {
        private String dealershipName;
        private List<Cars>availableCars;
        private  List<Cars>soldCars;

        public Dealership(String dealershipName){
            this.dealershipName = dealershipName;
            this.availableCars = new ArrayList<>();
            this.soldCars = new ArrayList<>();
        }

    public String getDealershipName() {
        return dealershipName;
    }

    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }

    public List<Cars> getAvailableCars() {
        return availableCars;
    }

    public void setAvailableCars(List<Cars> availableCars) {
        this.availableCars = availableCars;

    }

    public List<Cars> getSoldCars() {
        return soldCars;
    }

    public void setSoldCars(List<Cars> soldCars) {

    }



    @Override
    public String toString() {
        return "Dealership{" +
                "dealershipName='" + dealershipName + '\'' +
                ", availableCars=" + availableCars +
                ", soldCars=" + soldCars +
                '}';

    }
    public void buyCars(String license){
            if(availableCars.size() == 0 ){
                System.out.println("We are out of Cars");
                return;

            }
             for (int i = 0; i < availableCars.size(); i++) {
                 if (license.equals(availableCars.get(i).getPlateNum())) {
                  soldCars.add(availableCars.get(i));
                  availableCars.remove(availableCars.get(i));
                  return;
                 }
             }

    }
}







///*    String dealershipName;
//    List<Car> availableCars;
//    List<Car> soldCars
// String as long as it acts as a unique identifier for your car.
//method called “buyCar(String license)”.
// method will take in a license plate number,
// and will loop through the availableCars inventory.
// If the license plate passed into the method matches a license plate of a car in our ArrayList, then we will place it in the soldCars array, and remove it from the availableCars array
//*/