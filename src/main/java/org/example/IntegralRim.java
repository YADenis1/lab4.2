package org.example;

public class IntegralRim<T extends MathFunction> implements Functional<T> {

    private double a;
    private double b;
    private int n;

    public IntegralRim(double a, double b, int n) {
        this.a = a;
        this.b = b;
        this.n = n;
    }

    @Override
    public double calculate(T function) {
        if (function.getA() > a || function.getB() < b) {
            throw new IllegalArgumentException("function not defined");
        }

        double h = (b - a) / n;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double x = a + i * h;
            sum += function.calculate(x);
        }

        return sum * h;
    }
}