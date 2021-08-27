package ru.job4j.converter;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;
public class ConverterTest {

    @Test
    public void rubleToEuro() {
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        float epsEuro = 0.0001f;
        Assert.assertEquals(expectedEuro, outEuro, epsEuro);
    }

    @Test
    public void rubleToDollar() {
        float inDollar = 120;
        float expectedDollar = 2;
        float outDollar = Converter.rubleToDollar(inDollar);
        float epsDollar = 0.0001f;
        Assert.assertEquals(expectedDollar, outDollar, epsDollar);
    }
}