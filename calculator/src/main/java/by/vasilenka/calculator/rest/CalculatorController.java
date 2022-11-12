package by.vasilenka.calculator.rest;

import by.vasilenka.calculator.service.impl.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *  Calculator with 5 functions (plus, minus, mul, div, pow)
 *  Function "pow" I did with recursion
 */
@RestController
@RequestMapping("/calculator") // http://localhost:8080/calculator
public class CalculatorController {
    @Autowired
    CalculatorService calculatorService;

    @GetMapping
    public Long calculate(@RequestParam(name = "num1") Long num1,
                          @RequestParam(name = "num2") Long num2,
                          @RequestParam(name = "operation") String operation){

        switch (operation){
            case "plus": { // http://localhost:8080/calculator?num1=9&num2=3&operation=plus

                return calculatorService.plus(num1,num2);

            }
            case "minus": { // http://localhost:8080/calculator?num1=9&num2=3&operation=minus

                return calculatorService.minus(num1,num2);

            }
            case "mul": { // // http://localhost:8080/calculator?num1=9&num2=3&operation=mul

                return calculatorService.mul(num1,num2);

            }
            case "div": { // http://localhost:8080/calculator?num1=9&num2=3&operation=div

                return calculatorService.div(num1,num2);

            }
            case "pow": { // http://localhost:8080/calculator?num1=9&num2=3&operation=pow

                return calculatorService.pow(num1, Integer.parseInt(String.valueOf(num2)));

            }
            default: {

                throw new UnsupportedOperationException(String.format("%s operation is not supported", operation));

            }
        }
    }
}
