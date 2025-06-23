package com.softserve.academy.module05tst;

import org.junit.jupiter.api.*;

public class SimpleJUnit5Test {

    @BeforeAll
    public static void setup() {
        System.out.println("@BeforeAll executed");
    }

    @AfterAll
    public static void tear() {
        System.out.println("@AfterAll executed");
    }

    @BeforeEach
    public void setupThis() {
        System.out.println("\t@BeforeEach executed");
    }

    @AfterEach
    public void tearThis() {
        System.out.println("\t@AfterEach executed");
    }

    @Test
    public void testOne() {
        System.out.println("\t\t@Test testOne()");
        Assertions.assertEquals(4, 2 + 2);
    }

    @Test
    public void testTwo() {
        System.out.println("\t\t@Test testTwo()");
        Assertions.assertNotEquals(7, 2 + 4);
    }

    @Test
    public void testThree() {
        System.out.println("\t\t@Test testThree()");
        int i = 0;
        i = 10 / (i + 0);
    }

    @Test
    void testExpectedException() {
        RuntimeException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
            //Code under test
            int i = 0;
            i = 10 / (i + 0);
        });
        System.out.println("\t\tMessage = " + thrown.getMessage());
        Assertions.assertEquals("/ by zero", thrown.getMessage());
    }

    @Test
    void testExpectedException2() {
        NumberFormatException thrown = Assertions.assertThrows(NumberFormatException.class, () -> {
            int k = Integer.parseInt("One");
        }, "NumberFormatException was expected");
        System.out.println("\t\tMessage = " + thrown.getMessage());
        Assertions.assertEquals("For input string: \"One\"", thrown.getMessage());
    }
}
                