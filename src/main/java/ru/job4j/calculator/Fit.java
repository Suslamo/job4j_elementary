package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short heightM) {
        return  (heightM - 100) * 1.15;

    }

    public static double womanWeight(short heightW) {
        return (heightW - 110) * 1.15;
    }

    public static void main(String[] args) {
        short heightM = 187;
        short heightW = 170;
        double man = Fit.manWeight(heightM);
        double woman = Fit.womanWeight(heightW);
        System.out.println("Man 187 is " + man);
        System.out.println("woman 170 is " + woman);
    }
}
