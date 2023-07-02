package com.example.calculatorTest.service;

import com.example.calculatorTest.service.impl.СalculationServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ParameterizedServiceTest {
    СalculationService сalculationService = new СalculationServiceImpl();


    static Stream<Arguments> forPlus() {
        return Stream.of(
                Arguments.of(2, 5, 7),
                Arguments.of(-2, -5, -7),
                Arguments.of(-5, 5, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("forPlus")
    void plus(int a, int b, int expected) {
        assertEquals(expected, сalculationService.plus(a, b));
    }

    static Stream<Arguments> forMinus() {
        return Stream.of(
                Arguments.of(2, 5, -3),
                Arguments.of(-2, -5, 3),
                Arguments.of(-5, 5, -10)
        );
    }

    @ParameterizedTest
    @MethodSource("forMinus")
    void minus(int a, int b, int expected) {
        assertEquals(expected, сalculationService.minus(a, b));
    }

    static Stream<Arguments> forMultiply() {
        return Stream.of(
                Arguments.of(2, 5, 10),
                Arguments.of(-2, -5, 10),
                Arguments.of(-5, 5, -25)
        );
    }

    @ParameterizedTest
    @MethodSource("forMultiply")
    void multiply(int a, int b, int expected) {
        assertEquals(expected, сalculationService.multiply(a, b));
    }

    static Stream<Arguments> forDivide() {
        return Stream.of(
                Arguments.of(5, 5, 1),
                Arguments.of(10, -5, -2),
                Arguments.of(5, 5, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("forDivide")
    void divide(int a, int b, int expected) throws Exception {
        assertEquals(expected, сalculationService.divide(a, b));
    }
}
