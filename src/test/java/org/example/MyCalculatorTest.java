package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyCalculatorTest  {

     @Test
    public void testSum() {

        MyCalculator calculator = new MyCalculator();
        int sum = calculator.sum(1,2);
        assertEquals(3, sum);
    }
    @Test
    public void testSub() {
        MyCalculator calculator = new MyCalculator();
        int sub= calculator.sub(2,1);
        assertEquals(1, sub);

    }
    @Test
    public void testMup() {
        MyCalculator calculator = new MyCalculator();
        int Mup = calculator.Mup(2,2);
        assertEquals(4, Mup);
    }
    @Test
    public void testDiv() {
        MyCalculator calculator = new MyCalculator();
        int Div = calculator.Div(12,2);
        assertEquals(6, Div);
    }
}