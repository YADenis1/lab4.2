package org.example;

import static java.lang.Math.exp;

public class Fun4 implements MathFunction{
    private final double A;
    private final double B;
    Fun4(double A, double B){
        this.A = A;
        this.B = B;
    }

    @Override
    public double getA() {
        return A;
    }

    @Override
    public double getB() {
        return B;
    }

    @Override
    public double calculate(double num) {
        return (A*exp(num)+B);
    }
}
