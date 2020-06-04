package ru.job4j.array;

/**
 * Turn класс содержит метод переворачивающий массив в обратном порядке.
 * @author Alexey Cheremisin
 * @since 04.05.2020
 * @version 1
 */
public class Turn {
    /**
     * back метод переворачивающий массив в обратном порядке.
     * @param array : массив чисел.
     * @return массив с обратным порядком элементов
     */
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
        return array;
    }
}
