package com.softserve.academy.module05tst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    public void checkAdd1() {
        Calc calc = new Calc();
        double expected;
        double actual;
        //
        expected = 10.001;
        actual = calc.add(5, 5);
        Assertions.assertEquals(expected, actual, 0.01, "my error");
    }

    @Test
    public void checkAdd2() {
        Calc calc = new Calc();
        double expected;
        double actual;
        //
        expected = 10;
        actual = calc.add(6, 4);
        Assertions.assertEquals(expected, actual, 0.01, "my error");
    }

    @Test
    public void checkDiv1() {
        Calc calc = new Calc();
        double expected;
        double actual;
        //
        expected = 4;
        actual = calc.div(20, 5);
        Assertions.assertEquals(expected, actual, 0.01, "my error");
    }

    @Test
    public void checkDiv2() {
        Calc calc = new Calc();
        double expected;
        double actual;
        //
        expected = 2.5;
        actual = calc.div(20, 8);
        Assertions.assertEquals(expected, actual, 0.01, "my error");
    }
}
