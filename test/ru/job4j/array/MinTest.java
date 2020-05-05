package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * MinTest тест-класс для класса Min.
 * @author Alexey Cheremisin
 * @since 05.05.2020
 * @version 1
 */
public class MinTest {
    /**
     * whenFirstMin тест-метод на метод findMin(int[]).
     * Если первый элемент минимальный.
     */
    @Test
    public void whenFirstMin() {
        assertThat(
                Min.findMin(
                        new int[] {0, 5, 10}
                ),
                is(0)
        );
    }

    /**
     * whenLastMin тест-метод на метод findMin(int[]).
     * Если последний элемент минимальный.
     */
    @Test
    public void whenLastMin() {
        assertThat(
                Min.findMin(
                        new int[] {10, 5, 3}
                ),
                is(3)
        );
    }

    /**
     * whenMiddleMin тест-метод на метод findMin(int[]).
     * Если средний элемент минимальный.
     */
    @Test
    public void whenMiddleMin() {
        assertThat(
                Min.findMin(
                        new int[] {10, 2, 5}
                ),
                is(2)
        );
    }

    /**
     * whenElementsEquals тест-метод на метод findMin(int[]).
     * Если все элементы массива одинаковы.
     */
    @Test
    public void whenElementsEquals() {
        assertThat(
                Min.findMin(
                        new int[] {10, 10, 10}
                ),
                is(10)
        );
    }
}