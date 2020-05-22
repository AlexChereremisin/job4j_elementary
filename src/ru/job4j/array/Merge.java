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
        int pstL = 0;
        int pstR = 0;
        while (pstL + pstR < rsl.length) {
            pstL = pstL < left.length ? pstL : left.length - 1;
            pstR = pstR < right.length ? pstR : right.length - 1;
            rsl[pstL + pstR] = Math.min(left[pstL], right[pstR]);
            if (left[pstL] == right[pstR]) {
                pstL++;
                pstR++;
            } else if (left[pstL] == rsl[pstL + pstR]) {
                pstL++;
                if (pstL > left.length - 1) {
                    rsl[pstL + pstR] = Math.max(left[left.length - 1], right[pstR]);
                    pstR++;
                }
            } else if (right[pstR] == rsl[pstL + pstR]) {
                pstR++;
                if (pstR > right.length - 1) {
                    rsl[pstL + pstR] = Math.max(left[pstL], right[right.length - 1]);
                    pstL++;
                }
            }
            if (pstL >= left.length - 1 ^ pstR >= right.length - 1) {
                rsl[rsl.length - 1] = Math.max(left[left.length - 1], right[right.length - 1]);
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
