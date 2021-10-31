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
    public void whenP6K4SquareDot() {
        double expected = 1.44;
        int p = 6;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K5SquareDot2() {
        double expected = 1.25;
        int p = 6;
        double k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K2SquareDot3() {
        double expected = 3.55;
        int p = 8;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K2SquareDot4() {
        double expected = 6.72;
        int p = 11;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
