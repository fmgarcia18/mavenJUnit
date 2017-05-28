package com.fmgarcia.developer;

/**
 * Created by francys on 13/05/2017.
 */
public class Calculator implements ICalculator{

    public Calculator() {
    }

    /**
     * suma dos numeros
     *
     * @param num1
     * @param num2
     * @return la suma de dos numeros
     */
    public int add(int num1, int num2) {

        int result = num1 + num2;

        return result;
    }

    /**
     * resta dos numeros
     *
     * @param num1
     * @param num2
     * @return la resta de dos numeros
     */
    public int sub(int num1, int num2) {

        int result = num1 - num2;
        return result;
    }

    /**
     * multiplica dos numeros
     *
     * @param num1
     * @param num2
     * @return la multiplicacion de dos numeros
     */
    public int mul(int num1, int num2) {
        return 0;
    }

    /**
     * divide dos numeros
     *
     * @param num1
     * @param num2
     * @return la division de dos numeros
     */
    public int div(int num1, int num2) {
        return 0;
    }
}
