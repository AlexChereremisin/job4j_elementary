package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Array2DToList {
    public static List<Integer> array2DToList(final Integer[][] array2D) {
        return Stream.of(array2D).flatMap(Arrays::stream).collect(Collectors.toList());
    }
}
