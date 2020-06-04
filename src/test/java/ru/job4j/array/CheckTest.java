package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * CheckTest тест-класс для класса Check.
 * @author Alexey Cheremisin
 * @since 05.05.2020
 * @version 1
 */
public class CheckTest {
    /**
     * whenDataMonoByTrueThenTrue тест-метод для метода mono(boolean[]). Проверка с массивом одинаковых элементов.
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * whenDataNotMonoByTrueThenFalse тест-метод для метода mono(boolean[]). Проверка с массивом неодинаковых элементов.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[] {true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }
}