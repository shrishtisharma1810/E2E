package com.mycompany.app;

import org.testng.annotations.Listeners;

//import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * Unit test for simple App.
 */
@Listeners(ITestListenerEx.class)
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Assert.assertTrue( true );
        System.out.println("shouldAnswerWithTrue");
    }
    @Test
    public void shouldAnswerWithFalse()
    {
        Assert.assertFalse( true );
        System.out.println("shouldAnswerWithFalse");
    }
    @Test
    public void AnswerWithTrue()
    {
        Assert.assertTrue( true );
        System.out.println("AnswerWithTrue");
    }
    @Test
    public void AnswerWithFalse()
    {
        Assert.assertFalse( false );
        System.out.println("AnswerWithFalse");
    }
}
