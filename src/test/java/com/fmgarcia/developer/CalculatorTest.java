package com.fmgarcia.developer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by francys on 13/05/2017.
 */
public class CalculatorTest {

    private ICalculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void add(){

        int result = calculator.add(1,1);

        Assert.assertEquals(2, result);
    }

    @Test
    public void rest(){

        int result = calculator.sub(2,1);

        Assert.assertEquals(1, result);
    }
}
