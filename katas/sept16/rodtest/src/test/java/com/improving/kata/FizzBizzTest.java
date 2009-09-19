package com.improving.kata;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBizzTest
{
    @Test
    public void shouldStartByShoutingOne() {
        FizzBizz fizzBizz = new FizzBizz();
        assertEquals("1", fizzBizz.shout());
    }

    @Test
    public void shouldShoutTwoAfterOne() {
        FizzBizz fizzBizz = new FizzBizz(1);
        assertEquals("2", fizzBizz.shout());
    }

    @Test
    public void shouldFizzOnThirdShout() {
        FizzBizz fizzBizz = new FizzBizz(2);
        assertEquals("Fizz", fizzBizz.shout());
    }

    @Test
    public void shouldFizzOnSixthShout() {
        FizzBizz fizzBizz = new FizzBizz(5);
        assertEquals("Buzz", fizzBizz.shout());
    }
}
