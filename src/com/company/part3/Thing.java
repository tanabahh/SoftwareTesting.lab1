package com.company.part3;


public abstract class Thing {
    private String name;
    private boolean heavy;
    private int years;

    public Thing(String name, boolean heavy, int years) {
        this.name = name;
        this.heavy = heavy;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public boolean isHeavy() {
        return heavy;
    }

    public int getYears() {
        return years;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeavy(Boolean heavy){
        this.heavy = heavy;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
