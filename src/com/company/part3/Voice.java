package com.company.part3;

public class Voice implements Action{
    private String type;

    public Voice(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean squeal(String characteristic) {
        System.out.printf("%s верещал %s голос", characteristic, this.type);
        return true;
    }
}
