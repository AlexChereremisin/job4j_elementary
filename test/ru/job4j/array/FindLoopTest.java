package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * FindLoopTest тест-класс на класс FindLoop.
 * @author Alexey Cheremisin
 * @since 03.05.2020
 * @version 1
 */
public class FindLoopTest {
    /**
     * whenArrayHas5Then0 тест-метод на метод indexOf(int[], int). В массиве [5, 10, 3] ищем 5.
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * whenArrayHas6Then1 тест-метод на метод indexOf(int[], int). В массиве [5, 6, 4, 12, 6] ищем 6.
     */
    @Test
    public void whenArrayHas6Then1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 6, 4, 12, 6};
        int value = 6;
        int result = find.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }

    /**
     * whenArrayHas2ThenMinus1 тест-метод на метод indexOf(int[], int). В массиве [5, 6, 4, 12, 6] ищем 2.
     */
    @Test
    public void whenArrayHas2ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 6, 4, 12, 6};
        int value = 2;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}