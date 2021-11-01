package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
    int expected = 2;
    int p = 6;
    double k = 2;
    double out = SqArea.square(p, k);
    Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K4Square1Dot44() {
        double expected = 1.44;
        int p = 6;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K5Square1Dot25() {
        double expected = 1.25;
        int p = 6;
        double k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K2Square3Dot55() {
        double expected = 3.55;
        int p = 8;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K2Square6Dot72() {
        double expected = 6.72;
        int p = 11;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
