package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * MinDiapasonTest тест-класс для класса MinDiapason.
 * @author Alexey Cheremisin
 * @since 05.05.2020
 * @version 1
 */
public class MinDiapasonTest {
    /**
     * whenFirstMin тест-метод на метод findMin(int[], int, int).
     * Проверяем, что в массиве [-1, 0, 5, 10] между 1 и 3 элементом минимум это 0.
     */
    @Test
    public void whenFirstMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {-1, 0, 5, 10},
                        1, 3
                ),
                is(0)
        );
    }

    /**
     * whenLastMin тест-метод на метод findMin(int[], int, int).
     * Проверяем, что в массиве [10, 5, 3, 1] между 1 и 3 элементом минимум это 1.
     */
    @Test
    public void whenLastMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {10, 5, 3, 1},
                        1, 3
                ),
                is(1)
        );
    }

    /**
     * whenMiddleMin тест-метод на метод findMin(int[], int, int).
     * Проверяем, что в массиве [10, 2, 5, 1] между 0 и 2 элементом минимум это 2.
     */
    @Test
    public void whenMiddleMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {10, 2, 5, 1},
                        0, 2
                ),
                is(2)
        );
    }
}