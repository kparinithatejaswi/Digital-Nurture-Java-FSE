package com.digitalnurture.JUnitExercise4;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

    // Setup Method
    @Before
    public void setUp() {
        System.out.println("Setting up Calculator...");
        calculator = new Calculator();
    }

    // Test Method using AAA Pattern
    @Test
    public void testAdd() {

        // Arrange
        int a = 5;
        int b = 10;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(15, result);
    }

    // Teardown Method
    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calculator = null;
    }
}