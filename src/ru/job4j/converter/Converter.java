package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60; /* формула перевода рублей в доллары. */

    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        float inDollar = 120;
        float expectedDollar = 2;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passed2 = expectedDollar == outDollar;
        System.out.println("140 rubles are " + euro + " euro." + passedEuro);
        System.out.println("120 rubles are " + dollar + " dollar." + passed2);
    }
}
