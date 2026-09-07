package com.contact;

public class Person {
    private String ci;
    private String name;
    private String lastName;
    private String cel;
    private String address;
    public Person(String ci, String name, String lastName) {
        this.ci = ci;
        this.name = name;
        this.lastName = lastName;
    }
    public void print() {
        System.out.println("-----------------------------");
        System.out.println("Ci: " + this.ci);
        System.out.println("Name: " + this.name);
        System.out.println("LastName: " + this.lastName);
        System.out.println("Cel: " + this.cel);
        System.out.println("Address: " + this.address);
        System.out.println("-----------------------------");

    }
    public String getCi() {
        return ci;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCel() {
        return cel;
    }
    public void setCel(String cel) {
        this.cel = cel;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
