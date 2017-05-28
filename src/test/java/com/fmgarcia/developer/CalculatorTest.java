package com.fmgarcia.developer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.rmi.server.ExportException;

/**
 * Created by francys on 13/05/2017.
 */
public class CalculatorTest {

    private ICalculator calculator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

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

    @Test(expected = ArithmeticException .class)
    public void divErrorDivisionByZero(){

        int result = calculator.div(2, 0);
        Assert.assertEquals(1, result);

    }

    @Test
    public void divErrorDivisionByZeroFail(){

        try {
            int result = calculator.div(3, 0);
            Assert.fail("should have failed with ArithmeticException");
        }catch (ArithmeticException e){

        }
    }

    @Test
    public void divErrorDivisionByZeroRule(){

        thrown.expect(ArithmeticException.class);
        //thrown.expectMessage("should have failed with ArithmeticException");

        int result = calculator.div(3, 0);

    }


    @Test
    public void div(){

        int result = calculator.div(2,2);

        Assert.assertEquals(1, result);
    }
}
