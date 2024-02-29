package org.example;

import java.util.Scanner;

public class ScientificCalculator {
    public double squareRoot(double number) {


            double result = Math.sqrt(number);
            return Math.sqrt(number);
        }


    public long factorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
        }

    public double naturalLog(double x) {

            double result = Math.log(x);
            return result;
        }


    public double power(double base,double exponent) {

        double result = Math.pow(base, exponent);
        return result;
    }
}

