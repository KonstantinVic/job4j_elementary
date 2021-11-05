package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        if ((x1 == (x1 + 1)) && (y1 == (y1 + 1))) {
            Math.abs(x2 - x1);
            Math.abs(y2 - y1);
        }
        return 0;
    }
}
