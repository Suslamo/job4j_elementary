package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X4Test {

    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
}