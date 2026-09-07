package com.contact;

import java.util.HashMap;

public class ContactHandler {
    private HashMap<String, Person> listContHashMap;
    public ContactHandler() {
        listContHashMap = new HashMap<>();
    }
    public void add(Person person) {
        if (person.getCi() == null) {
            throw new Error("The ci is null");
        }
        listContHashMap.put(person.getCi(), person);
    }
    public Person search(String ci ) {
        if (listContHashMap.get(ci) != null) {
            return listContHashMap.get(ci);
        }
        return null;
    }
    public void showList() {
        for (Person person : this.listContHashMap.values()) {
            person.print();
        }
    }
    public Boolean remove(String ci) {
        if (this.listContHashMap.get(ci) != null) {
            this.listContHashMap.remove(ci);
            return true;
        }
        return false;
        
    }
}
