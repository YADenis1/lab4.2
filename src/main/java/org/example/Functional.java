package org.example;

public interface Functional<T extends MathFunction> {
    double calculate(T function);
}
