package com.fmgarcia.developer;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by francys on 13/05/2017.
 */
public class CalculatorTest {


    @Test
    public void add(){
        ICalculator calculator = new Calculator();

        int result = calculator.add(1,1);

        Assert.assertEquals(2, result);
    }
}
