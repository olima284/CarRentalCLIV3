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

    }
}




///*    String dealershipName;
//    List<Car> availableCars;
//    List<Car> soldCars
// String as long as it acts as a unique identifier for your car.
//*/