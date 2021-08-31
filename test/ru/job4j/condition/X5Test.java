package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X5Test {

    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
}