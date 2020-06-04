package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * SwitchArrayTest тест-класс на класс SwitchArray.
 * @author Alexey Cheremisin
 * @since 03.05.2020
 * @version 1
 */
public class SwitchArrayTest {
    /**
     * whenSwap0to3 тест-метод на метод swap(int[], int, int). Проверка на перемену 1 и 4 элемента в [1, 2, 3, 4].
     */
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    /**
     * whenSwap1to2 тест-метод на метод swap(int[], int, int). Проверка на перемену 2 и 3 элемента в [1, 2, 3, 4].
     */
    @Test
    public void whenSwap1to2() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 3, 2, 4};
        int[] rsl = SwitchArray.swap(input, 1, 2);
        assertThat(rsl, is(expect));
    }

    /**
     * whenSwap1to1 тест-метод на метод swap(int[], int, int). Проверка на перемену 2 и 2 элемента в [1, 2, 3, 4].
     */
    @Test
    public void whenSwap1to1() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 2, 3, 4};
        int[] rsl = SwitchArray.swap(input, 1, 1);
        assertThat(rsl, is(expect));
    }
}