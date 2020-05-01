package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean isMax = left >= right;
        int result = isMax ? left : right;
        return result;
    }
}
