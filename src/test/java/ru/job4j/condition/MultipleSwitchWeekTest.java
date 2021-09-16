package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDa1() {
        String name = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDa2() {
        String name = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDa3() {
        String name = "Вторник";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDa4() {
        String name = "Tuesday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDa5() {
        String name = "Среда";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDa6() {
        String name = "Wednesday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDa7() {
        String name = "Четверг";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDa8() {
        String name = "Thursday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDa9() {
        String name = "Пятница";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDa10() {
        String name = "Friday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDa11() {
        String name = "Суббота";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDa12() {
        String name = "Saturday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDa13() {
        String name = "Воскресенье";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDa14() {
        String name = "Sunday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void numberOfDa15() {
        String name = "Март";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}