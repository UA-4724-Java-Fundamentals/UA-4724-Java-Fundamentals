package com.softserve.academy.module01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ScannerExampleTest {

    @Test
    @DisplayName("Verify ScannerExample class is public")
    void testScannerExampleIsPublic() {
        // Check if ScannerExample class is public
        assertTrue(Modifier.isPublic(ScannerExample.class.getModifiers()), 
                "ScannerExample class should be public");
    }

    @Test
    @DisplayName("Verify main method has correct signature")
    void testMainMethodIsCorrect() throws NoSuchMethodException {
        // Get the main method
        Method mainMethod = ScannerExample.class.getMethod("main", String[].class);

        // Check if the main method is public
        assertTrue(Modifier.isPublic(mainMethod.getModifiers()), 
                "main method should be public");

        // Check if the main method is static
        assertTrue(Modifier.isStatic(mainMethod.getModifiers()), 
                "main method should be static");

        // Check if the main method returns void
        assertEquals(void.class, mainMethod.getReturnType(), 
                "main method should return void");

        // Check if the main method has the correct parameter (String[] args)
        Class<?>[] parameterTypes = mainMethod.getParameterTypes();
        assertEquals(1, parameterTypes.length, 
                "main method should have exactly one parameter");
        assertEquals(String[].class, parameterTypes[0], 
                "main method parameter should be String[]");
    }
}
