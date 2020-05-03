package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * SquareTest тест-класс на класс Square.
 * @author Alexey Cheremisin
 * @since 03.05.2020
 * @version 1
 */
public class SquareTest {
    /**
     * whenBound3Then014 тест-метод. При bound = 3 ожидаем массив [0, 1, 4].
     */
    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4};
        assertThat(rst, is(expect));
    }

    /**
     * whenBound5Then014916 тест-метод. При bound = 5 ожидаем массив [0, 1, 4, 9, 16].
     */
    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4, 9, 16};
        assertThat(rst, is(expect));
    }
}