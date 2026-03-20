package org.example;

import static java.lang.Math.sin;

public class Fun3 implements MathFunction{
    private final double A;
    private final double B;
    private final double C;
    private final double D;

    Fun3(double A, double B, double C, double D){
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    @Override
    public double getA() {
        return A;
    }

    @Override
    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }

    public double getD() {
        return D;
    }

    @Override
    public double calculate(double num) {
        return (A/num+B)/(C*num+D);
    }
}
