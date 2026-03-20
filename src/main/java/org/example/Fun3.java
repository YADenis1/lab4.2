package org.example;

import static java.lang.Math.sin;

public class Fun3 implements MathFunction{
    private final double A;
    private final double B;

    Fun3(double A, double B){
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
        return (2/num+3)/(1*num+2);
    }
}
