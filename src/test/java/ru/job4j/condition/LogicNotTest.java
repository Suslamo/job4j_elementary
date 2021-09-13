package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class LogicNotTest {

    @Test
    public void isEven() {
        int num = 2;
        Assert.assertTrue(LogicNot.isEven(num));
    }

    @Test
    public void isPositive() {
        int num = 1;
        Assert.assertTrue(LogicNot.isPositive(num));
    }

    @Test
    public void notEven() {
        int num = 3;
        Assert.assertTrue(LogicNot.notEven(num));
    }

    @Test
    public void notPositive() {
        int num = -1;
        Assert.assertTrue(LogicNot.notPositive(num));
    }

    @Test
    public void notEvenAndPositive() {
        int num = 3;
        Assert.assertTrue(LogicNot.notEvenAndPositive(num));
    }

    @Test
    public void evenOrNotPositive() {
        int num = -2;
        Assert.assertTrue(LogicNot.evenOrNotPositive(num));

    }
}