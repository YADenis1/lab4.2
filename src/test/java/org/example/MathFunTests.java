package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathFunTests {

    private static final double E = 1e-2;

    @Test
    void testSumFun() {
        Fun1 f = new Fun1(0, 2);
        SumFunctional<Fun1> sum = new SumFunctional<>();

        assertEquals((1+5)*1.5, sum.calculate(f), E);
    }

    @Test
    void testIntegral1() {
        Fun1 f = new Fun1(0, 2);
        IntegralRim<Fun1> integral = new IntegralRim<>(0, 2, 1000);

        assertEquals(6, integral.calculate(f), E);
    }

    @Test
    void testIntegral2() {
        Fun1 f = new Fun1(0, 5);
        IntegralRim<Fun1> integral = new IntegralRim<>(0, 1, 1000);

        assertEquals(2, integral.calculate(f), E);
    }

    @Test
    void testIntegral3() {
        Fun1 f = new Fun1(1, 2);
        IntegralRim<Fun1> integral = new IntegralRim<>(0, 10, 100);

        assertThrows(IllegalArgumentException.class, () -> integral.calculate(f));
    }
}