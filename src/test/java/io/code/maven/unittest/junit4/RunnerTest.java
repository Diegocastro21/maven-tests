package io.code.maven.unittest.junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RunnerTest {

    @Before
    public void setUp(){
        System.out.println("\nRunning SetUp. . .");
    }
    @Test
    public void sumReturnsCorrectResult(){

        System.out.println("Running sumReturnsCorrectResult. . .");
        final int number1 = 3;
        final int number2 = 5;

        final int expected = 8;

        final int actual = Runner.sum(number1, number2);

        assertEquals(expected, actual);
        //assertEquals(expected - 1, actual);
    }

    @After
    public void tearDown(){
        System.out.println("Running tearDown. . .\n");
    }
}
