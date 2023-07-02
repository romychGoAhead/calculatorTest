package com.example.calculatorTest.service;

public interface СalculationService {
    int plus(int a, int b);

    int minus(int a, int b);

    int multiply(int a, int b);

    int divide(int a, int b) throws Exception;
}


//    1. Метод по адресу /calculator должен вернуть приветствие “Добро пожаловать в калькулятор".
//
//    2. Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате “5 + 5 = 10”.
//
//    3. Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть результат в формате “5 − 5 = 0”.
//
//    4. Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат в формате “5 * 5 = 25”.
//
//    5. Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате “5 / 5 = 1”.


