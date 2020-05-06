package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * MatrixCheckTest тест-класс для класса MatrixCheck.
 * @author Alexey Cheremisin
 * @since 06.05.2020
 * @version 1
 */
public class MatrixCheckTest {
    /**
     * whenHasMonoHorizontal тест-метод для метода monoHorizontal(char[][], int).
     * Проверяем, что монострока определяется правильно.
     */
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    /**
     * whenHasNoMonoHorizontal тест-метод для метода monoHorizontal(char[][], int).
     * Проверяем, что не моностроки определяются правильно.
     */
    @Test
    public void whenHasNoMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 0);
        assertThat(result, is(false));
    }

    /**
     * whenHasMonoVertical тест-метод для метода monoVertical(char[][], int).
     * Проверяем, что моностол,tw определяется правильно.
     */
    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    /**
     * whenHasMonoVertical тест-метод для метода monoVertical(char[][], int).
     * Проверяем, что не моностолбцы определяются правильно.
     */
    @Test
    public void whenHasNoMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 0);
        assertThat(result, is(false));
    }

    /**
     * whenDiagonal тест-метод для метода extractDiagonal(char[][]).
     * Проверяем правильность получения из элементов диагонали двумерного массива одномерного массива с этими элементами.
     */
    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(result, is(expect));
    }
}