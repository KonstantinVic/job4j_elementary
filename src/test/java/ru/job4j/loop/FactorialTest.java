package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int rs = Factorial.calc(5);
        int expected = 120;
        Assert.assertEquals(rs, expected);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
            int rs = Factorial.calc(1);
            int expected = 1;
            Assert.assertEquals(rs, expected);
    }
}