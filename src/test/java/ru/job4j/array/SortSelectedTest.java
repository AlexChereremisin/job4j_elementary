package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * SortSelectedTest тест-класс для класса SortSelected.
 * @author Alexey Cheremisin
 * @since 06.05.2020
 * @version 1
 */
public class SortSelectedTest {
    /**
     * whenSort5Elements тест-метод на метод sort(int[]).
     * Проверяем сортировку массива [3, 4, 1, 2, 5] с ожиданием [1, 2, 3, 4, 5].
     */
    @Test
    public void whenSort5Elements() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    /**
     * whenSort5Elements тест-метод на метод sort(int[]).
     * Проверяем сортировку массива [5, 10, 9] с ожиданием [5, 9, 10].
     */
    @Test
    public void whenSort3Elements() {
        int[] input = new int[] {5, 10, 9};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {5, 9, 10};
        assertThat(result, is(expect));
    }
}