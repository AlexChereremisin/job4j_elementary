package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * EndsWithTest тест-класс для класса EndsWith.
 * @author Alexey Cheremisin
 * @since 05.05.2020
 * @version 1
 */
public class EndsWithTest {
    /**
     * whenEndWithPostfixThenTrue тест-метод на метод endsWith(char[], char[]).
     * Проверяющий ситуацию когда post является подмассивом word начиная с (word.length - post.length) индекса.
     */
    @Test
    public void whenEndWithPostfixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    /**
     * whenNotEndWithPostfixThenFalse тест-метод на метод endsWith(char[], char[]).
     * Проверяющий ситуацию когда post неявляется подмассивом word начиная с (word.length - post.length) индекса.
     */
    @Test
    public void whenNotEndWithPostfixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}