package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * ArrayCharTest тест-класс для класса ArrayChar.
 * @author Alexey Cheremisin
 * @since 05.05.2020
 * @version 1
 */
public class ArrayCharTest {
    /**
     * whenStartWithPrefixThenTrue тест-метод на метод startsWith(char[], char[]).
     * Проверяющий ситуацию когда pref является подмассивом word начиная с 0 индекса.
     */
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    /**
     * whenNotStartWithPrefixThenFalse тест-метод на метод startsWith(char[], char[]).
     * Проверяющий ситуацию когда pref неявляется подмассивом word начиная с 0 индекса.
     */
    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
}