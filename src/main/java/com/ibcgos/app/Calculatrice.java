
package com.ibcgos.app;

public class Calculatrice {

    public double somme(double a, double b) {
        return a + b;
    }

    public double soustraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException(
                "Division par zéro impossible"
            );
        }
        return a / b;
    }

    public double puissance(double a, double b) {
        return Math.pow(a, b);
    }

    public double modulo(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException(
                "Modulo par zéro impossible"
            );
        }
        return a % b;
    }
}
