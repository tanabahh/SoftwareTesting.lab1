package com.company.part1;

public class Taylor {
    public int steps;

    public Taylor(int steps) {
        this.steps = steps;
    }

    public double cos(double x) {
        double taylor = 0;
        for (int i = 0; i < this.steps; i++){
            taylor = taylor + Math.pow(-1, i) * (Math.pow(x, 2 * i) / factorial(2 * i));
        }
        return taylor;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
