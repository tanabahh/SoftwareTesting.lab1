package com.company.part3;

public class Human extends Creature{
    private String surname;

    public Human(String name, String surname) {
        super(name);
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
