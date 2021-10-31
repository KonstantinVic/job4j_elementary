package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight188ThenDot() {
        short in = 188;
        double expected = 101.2;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight188ThenDot2() {
        short in = 188;
        double expected = 89.7;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}