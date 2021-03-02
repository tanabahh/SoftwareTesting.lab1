package com.company.part3;

public abstract class Creature implements CreatureAction{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Creature(String name) {
        this.name = name;
    }

    @Override
    public boolean leanOnShoulder(Thing thing) {
        if (thing.isHeavy()) {
            System.out.printf("%s уперся плечем в %s, но не получилось\n", this.name, thing.getName());
            return false;
        } else {
            System.out.printf("%s уперся плечем в %s, и она поддалась\n", this.name, thing.getName());
            return true;
        }
    }

    @Override
    public boolean lockUp(Thing thing) {
        if (thing.getYears() > 10) {
            System.out.printf("%s не запер %s\n", this.name, thing.getName());
            return false;
        } else {
            System.out.printf("%s запер %s\n", this.name, thing.getName());
            return true;
        }
    }

    @Override
    public boolean pushIn(Thing thing) {
        System.out.printf("%s просунул пальцы в %s\n", this.name, thing.getName());
        return true;
    }
}
