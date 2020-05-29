package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDiapasonResult {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        for (int x = start; x < end; x++) {
            rsl.add(func.apply(x * 1.0));
        }
        return rsl;
    }
}
