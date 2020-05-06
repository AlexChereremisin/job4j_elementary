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
}