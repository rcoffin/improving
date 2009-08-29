package com.improving.kata;

public class FizzBizz
{
    private int count;

    public FizzBizz()
    {
    }

    FizzBizz(int initial)
    {
        count = initial;
    }

    public String shout()
    {
        return shouldFizz() ? "Fizz" : Integer.toString(count);
    }

    private boolean shouldFizz()
    {
        return (++count % 3 == 0);
    }
}
