package ru.job4j.array;

/**
 * Min класс содержит метод поиска минимального элемента в массиве.
 * @author Alexey Cheremisin
 * @since 05.05.2020
 * @version 1
 */
public class Min {
    /**
     * findMin метод поиска минимального элемента в массиве чисел.
     * @param array : массив чисел типа int.
     * @return минимальное число в массиве
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
