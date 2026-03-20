package org.example;

public class SumFunctional<T extends MathFunction> implements Functional<T> {

    @Override
    public double calculate(T function) {
        double a = function.getA();
        double b = function.getB();

        return (function.calculate(a) + function.calculate(b))*1.5;
    }
}