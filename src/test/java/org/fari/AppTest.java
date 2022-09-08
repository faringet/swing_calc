package org.fari;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testPlus() {
        MethodCalc mc = new MethodCalc();
        int res = mc.calc(15, "+", 5);
        assertEquals(20, res);
    }

    @Test
    public void testMinus() {
        MethodCalc mc = new MethodCalc();
        int res = mc.calc(15, "-", 5);
        assertEquals(10,res);
    }

    @Test
    public void testMultiply() {
        MethodCalc mc = new MethodCalc();
        int res = mc.calc(15, "*", 5);
        assertEquals(75,res);
    }

    @Test
    public void testDivide() {
        MethodCalc mc = new MethodCalc();
        int res = mc.calc(15,"/", 5);
        assertEquals(3,res);
    }

    //сейчас начнем делить на ноль!
    @Test (expected = ArithmeticException.class)
    public void testDivideByZero() {
        MethodCalc mc = new MethodCalc();
        mc.calc(15, "/", 0);
    }
}
