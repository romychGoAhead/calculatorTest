package com.example.calculatorTest.service.impl;

import com.example.calculatorTest.exceptions.DivisionByZeroExceptions;
import com.example.calculatorTest.service.СalculationService;
import org.springframework.stereotype.Service;

@Service
public class СalculationServiceImpl implements СalculationService {
    @Override
    public int plus(int a, int b) {

        return a + b;
    }

    @Override
    public int minus(int a, int b) {

        return a - b;
    }

    @Override
    public int multiply(int a, int b) {

        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        if (b == 0) {

            throw new DivisionByZeroExceptions();
        }

        return a / b;
    }
}

