package com.enterprise;

public class Employed {
    private String name;
    private String lastname;
    private String ci;
    private Integer age;

    public Employed(String name, String lastname, String ci, Integer age) {
        this.name = name;
        this.lastname = lastname;
        this.ci = ci;
        this.age = age;
    }

    public void info() {
        System.out.println("Nombres: " + this.name);
        System.out.println("Apellidos: " + this.lastname);
        System.out.println("Ci: " + this.ci);
        System.out.println("Age: " + this.age);
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastname;
    }

    public String getCi() {
        return this.ci;
    }

    public Integer getAge() {
        return this.age;
    }
}
