package ru.job4j.condition;

public class ChessBoard {
    public static boolean isOk(int a) {
        return a <= 7 && a >= 0;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isOk(x1) && isOk(x2) && isOk(y1) && isOk(y2)) {
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
             rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }
}
