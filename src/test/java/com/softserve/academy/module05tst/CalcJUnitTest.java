package com.softserve.academy.module05tst;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalcJUnitTest {
    private Calc calc;

    @BeforeAll
    public void setup() {
        //System.out.println("@BeforeAll executed");
        System.out.println("@BeforeAll executed, ThreadId = " + Thread.currentThread().getId());
        calc = new Calc();
    }

    @DisplayName("Should calculate the correct sum")
    //@Test
    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}")
    @Order(3)
    @CsvSource({
            "1, 1, 2",
            "2, 3, 5"
    })
    public void checkAdd(double a, double b, double expected) {
        System.out.println("\t\t@Test checkAdd(), ThreadId = " + Thread.currentThread().getId());
        double actual = calc.add(a, b);
        assertEquals(expected, actual, 0.01, "my error");
    }

    @DisplayName("Should calculate the correct div")
    //@Test
    @ParameterizedTest(name = "{index} => a={0}, b={1}, div={2}")
    @Order(2)
    @CsvSource({
            "20, 5, 4",
            "20, 8, 2.5"
    })
    public void checkDiv(double a, double b, double expected) {
        System.out.println("\t\t@Test checkDiv(), ThreadId = " + Thread.currentThread().getId());
        double actual = calc.div(a, b);
        assertEquals(expected, actual, 0.01, "my error");
    }

}
