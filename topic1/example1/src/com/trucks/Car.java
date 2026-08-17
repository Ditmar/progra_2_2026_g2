package com.trucks;

public class Car {
    private String brand; //brand es marca
    private String model; // model es modelo
    private Integer velocity = 0; // velocidad
    //constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void accelerate() {
        this.velocity++;
    }
    public void showInfo() {
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Velocidad " + this.velocity);
    }
}
