package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        if (left.length == 0 && right.length != 0) {
            return right;
        }
        if (right.length == 0 && left.length != 0) {
            return left;
        }
        if (left.length == 0 && right.length == 0) {
            return rsl;
        }
        int elemL = 0;
        int countL = 0;
        int elemR = 0;
        int countR = 0;
        for (int index = 0; index < rsl.length - 1; index++) {
            if (left[elemL] < right[elemR]) {
                countL++;
                if (countL > left.length) {
                    rsl[index] = right[elemR];
                    elemR = ++elemR < right.length ? elemR : right.length - 1;
                    continue;
                }
                rsl[index] = left[elemL];
                elemL = ++elemL < left.length ? elemL : left.length - 1;
            } else if (left[elemL] > right[elemR]) {
                countR++;
                if (countR > right.length) {
                    rsl[index] = left[elemL];
                    elemL = ++elemL < left.length ? elemL : left.length - 1;
                    continue;
                }
                rsl[index] = right[elemR];
                elemR = ++elemR < right.length ? elemR : right.length - 1;
            } else {
                countL++;
                if (countL > left.length) {
                    rsl[index] = right[elemR];
                    elemR = ++elemR < right.length ? elemR : right.length - 1;
                } else {
                    rsl[index] = left[elemL];
                    elemL = ++elemL < left.length ? elemL : left.length - 1;
                }

            }
        }
        if (left[elemL] > right[elemR]) {
            rsl[rsl.length - 1] = left[elemL];
        } else {
            rsl[rsl.length - 1] = right[elemR];
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
