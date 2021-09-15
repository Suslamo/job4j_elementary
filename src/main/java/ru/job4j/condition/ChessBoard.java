package ru.job4j.condition;

public class ChessBoard {
    public static boolean validate(int a) {
        return a <= 7 && a >= 0;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (validate(x1) && validate(x2) && validate(y1) && validate(y2)) {
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
             rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }
}
