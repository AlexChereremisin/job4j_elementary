package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * TurnTest тест-класс для класса Turn.
 * @author Alexey Cheremisin
 * @since 04.05.2020
 * @version 1
 */
public class TurnTest {
    /**
     * whenTurnArrayWithEvenAmountOfElementsThenTurnedArray тест-метод для метода back(int[]).
     * Проверяем переворот массива с четным числом элементов.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    /**
     * whenTurnArrayWithEvenAmountOfElementsThenTurnedArray тест-метод для метода back(int[]).
     * Проверяем переворот массива с нечетным числом элементов.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] result = turner.back(input);
        int[] expect = new int[] {7, 6, 5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
}