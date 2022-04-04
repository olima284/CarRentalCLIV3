package com.careerdevs;



public class Cars {
    private String make;
    private String model;
    private short year;
    private String plateNum;


    public Cars(String make, String model, short year, String plateNum) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.plateNum = plateNum;

    }

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

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    @Override
        public String toString () {
            return "Cars{" +
                    "make='" + make + '\'' +
                    ", model='" + model + '\'' +
                    ", year=" + year +
                    ", plateNum='" + plateNum + '\'' +
                    '}';

        }
    }
