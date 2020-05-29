package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class CmpStringRvrOrder {
    public static void main(String[] args) {
        String[] strings = {
                "A",
                "AA",
                "AAA",
                "AAAA"
        };
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + left.length() + " : " + right.length());
            return right.length() - left.length();
        };
        Arrays.sort(strings, cmpDescSize);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
