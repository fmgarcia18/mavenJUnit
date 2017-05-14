package com.fmgarcia.developer;

/**
 * Created by francys on 13/05/2017.
 */
public interface ICalculator {

    /**
     * suma dos numeros
     * @param num1
     * @param num2
     * @return la suma de dos numeros
     */
    public int add(int num1, int num2);

    /**
     * resta dos numeros
     * @param num1
     * @param num2
     * @return la resta de dos numeros
     */
    public int sub(int num1, int num2);

    /**
     * multiplica dos numeros
     * @param num1
     * @param num2
     * @return la multiplicacion de dos numeros
     */
    public int mul(int num1, int num2);

    /**
     * divide dos numeros
     * @param num1
     * @param num2
     * @return la division de dos numeros
     */
    public int div(int num1, int num2);
}
