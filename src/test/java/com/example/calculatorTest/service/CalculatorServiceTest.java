package com.example.calculatorTest.service;

import com.example.calculatorTest.exceptions.DivisionByZeroExceptions;
import com.example.calculatorTest.service.impl.СalculationServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    СalculationService сalculationService = new СalculationServiceImpl();

    @Test
    void PlusPozitive() {
        int actual = сalculationService.plus(5, 5);
        assertEquals(10, actual);

    }

    @Test
    void PlusNegative() {
        int actual = сalculationService.plus(-5, -5);
        assertEquals(-10, actual);

    }

    @Test
    void MinusPozitive() {
        int actual = сalculationService.minus(5, 5);
        assertEquals(0, actual);

    }

    @Test
    void MinusNegative() {
        int actual = сalculationService.minus(-5, -5);
        assertEquals(0, actual);

    }

    @Test
    void multiplyPozitive() {
        int actual = сalculationService.multiply(5, 5);
        assertEquals(25, actual);

    }

    @Test
    void multiplyNegative() {
        int actual = сalculationService.multiply(-5, 3);
        assertEquals(-15, actual);

    }

    @Test
    void dividePozitive() throws Exception {
        int actual = сalculationService.divide(5, 5);
        assertEquals(1, actual);

    }

    @Test
    void divideNegative() throws Exception {
        int actual = сalculationService.divide(-6, 3);
        assertEquals(-2, actual);

    }

    @Test
    void exceptionToDivisionByZero() {

        assertThrows(DivisionByZeroExceptions.class, () -> сalculationService.divide(5, 0));

    }
}


