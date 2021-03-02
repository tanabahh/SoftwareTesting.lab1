package com.company.part3;

public class Door extends Thing{
    public static String type = "Дверь";
    private String material;

    public Door(String name, boolean heavy, int years, String material) {
        super(name, heavy, years);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
