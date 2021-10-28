package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert120RblThen3Dlr() {
        float inD = 120;
        float expectedD = 2;
        float outD = Converter.rubleToDollar(inD);
        float epsD = 0.0001f;
        Assert.assertEquals(expectedD, outD, epsD);
    }
}