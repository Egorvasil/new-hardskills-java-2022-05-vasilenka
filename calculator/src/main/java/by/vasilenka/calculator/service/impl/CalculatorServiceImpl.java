package by.vasilenka.calculator.service.impl;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public long plus(long num1, long num2) {

        return num1+num2;

    }

    @Override
    public long minus(long num1, long num2) {

        return num1-num2;

    }

    @Override
    public long mul(long num1, long num2) {

        return num1*num2;

    }

    @Override
    public long div(long num1, long num2) {

        return num1/num2;

    }
    @Override
    public long pow(long n, int base) { // with recursion

        return powHelper(n, base);

    }

    private long powHelper(long n, int base){ // recursive method

        if(base == 0){
            return 1;
        }
        return n*powHelper(n, base-1);
    }
}
