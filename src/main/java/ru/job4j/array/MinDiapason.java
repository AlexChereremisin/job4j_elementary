package ru.job4j.array;

/**
 * MinDiapason класс содержит метод нахождения минимального числа в массиве чисел в диапазоне индексов.
 * @author Alexey Cheremisin
 * @since 05.05.2020
 * @version 1
 */
public class MinDiapason {
    /**
     * findMin метод нахождения минимального числа в массиве чисел в диапазоне индексов.
     * @param array : массив чисел.
     * @param start : начальный индекс.
     * @param finish : конечный индекс.
     * @return минимальный элемент в массиве в заданном диапазоне,
     * если диапазон за границами массива, то Integer.MAX_VALUE
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
