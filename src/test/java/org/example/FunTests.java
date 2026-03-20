package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static java.lang.Math.sin;
import static java.lang.Math.exp;

public class FunTests {

    private static final double E = 1e-6;

    @Test
    void testFun1() {
        Fun1 f = new Fun1(2, 3);

        assertEquals(2, f.getA());
        assertEquals(3, f.getB());
        assertEquals(2 * 5 + 1, f.calculate(5), E);
    }

    @Test
    void testFun2() {
        Fun2 f = new Fun2(2, 3);

        assertEquals(2, f.getA());
        assertEquals(3, f.getB());
        assertEquals(3 * sin(3), f.calculate(3), E);
    }

    @Test
    void testFun3() {
        Fun3 f = new Fun3(2, 3);

        double x = 1;
        double expected = (2 / x + 3) / (1 * x + 2);

        assertEquals(expected, f.calculate(x), E);
    }


    @Test
    void testFun4() {
        Fun4 f = new Fun4(2, 3);

        assertEquals(1 * exp(1) + 3, f.calculate(1), E);
    }
}