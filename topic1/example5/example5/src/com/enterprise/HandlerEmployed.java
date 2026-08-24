package com.enterprise;

import java.util.ArrayList;

public class HandlerEmployed {
    private ArrayList<Employed> employedList;

    public HandlerEmployed() {
        this.employedList = new ArrayList<>();
    }

    public void addEmployed(Employed employed) {
        this.employedList.add(employed);
    }

    public Employed findEmployed(String ci) {
        for (Employed employed : this.employedList) {
            if (employed.getCi().equals(ci)) {
                return employed;
            }
        }
        return null;
    }

    public void listEmployed() {
        for (Employed employed : this.employedList) {
            System.out.println("*************************************");
            employed.info();
        }
    }

    public void removeEmployed(String ci) {
        Employed employed = this.findEmployed(ci);
        if (employed == null) {
            System.out.println("Empleado no encontrado");
            return;
        }
        this.employedList.remove(employed);
        System.out.println("Empleado borrado");
    }

}
