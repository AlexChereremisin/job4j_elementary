package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        if (left.length == 0 && right.length == 0) {
            return rsl;
        }
        if (left.length == 0) {
            return right;
        }
        if (right.length == 0) {
            return left;
        }
        int psL = 0;
        int psR = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (psL == left.length) {
                rsl[i] = right[psR];
                psR++;
            } else if (psR == right.length) {
                rsl[i] = left[psL];
                psL++;
            } else if (left[psL] <= right[psR]) {
                rsl[i] = left[psL];
                psL++;
            } else {
                rsl[i] = right[psR];
                psR++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
