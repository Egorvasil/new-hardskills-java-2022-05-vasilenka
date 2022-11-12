package by.vasilenka.calculator.service.impl;

/**
 * API for calculator with 5 function
 * 5th function with recursion
 * */

public interface CalculatorService {

    long plus(long num1, long num2);

    long minus(long num1, long num2);

    long mul(long num1, long num2);

    long div(long num1, long num2);

    /**
     * @param n - number
     * @param base - pow
     * **/

    long pow(long n, int base);

}
