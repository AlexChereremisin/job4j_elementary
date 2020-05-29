package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FunctionDiapasonResultTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionDiapasonResult.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenLinearResults() {
        List<Double> result = FunctionDiapasonResult.diapason(4, 7, x -> Math.pow(x, 2)  + 1);
        List<Double> expected = Arrays.asList(17D, 26D, 37D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenLinearResults() {
        List<Double> result = FunctionDiapasonResult.diapason(1, 4, x -> Math.pow(2, x)  + 1);
        List<Double> expected = Arrays.asList(3D, 5D, 9D);
        assertThat(result, is(expected));
    }
}