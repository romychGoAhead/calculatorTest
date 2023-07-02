package com.example.calculatorTest.controller;

import com.example.calculatorTest.service.СalculationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class Calculator {

    private final СalculationService service;

    public Calculator(СalculationService service) {
        this.service = service;
    }

    @GetMapping
    public String calculator() {
        return "<b>Добро пожаловать в калькулятор!</b> ";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") int a, @RequestParam("num2") int b) {

        return String.format("%s + %s = %s", a, b, service.plus(a, b));
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int a, @RequestParam("num2") int b) {

        return String.format("%s - %s = %s", a, b, service.minus(a, b));
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int a, @RequestParam("num2") int b) {

        return String.format("%s * %s = %s", a, b, service.multiply(a, b));
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        try {
            int result = service.divide(a, b);
            return String.format("%s / %s = %s", a, b, result);
        } catch (Exception e) {
            return "На 0 делить нельзя";

        }

    }

}


//  @GetMapping(path ="/hello")
//  public String answerCalculator(@RequestParam("name") String userName) {   //возвращает имя юзера
//    return "Привет" + userName;
//   }
