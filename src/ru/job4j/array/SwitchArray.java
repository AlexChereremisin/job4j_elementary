package ru.job4j.array;

/**
 * SwitchArray класс содержит методы осуществляющие перемену местами элементов массива.
 * @author Alexey Cheremisin
 * @since 03.05.2020
 * @version 1
 */
public class SwitchArray {
    /**
     * swap метод меняет местами элемент с индексом source на элемент dest.
     * @param array : массив чисел
     * @param source : индекс ячейки для произведения замены
     * @param dest : индекс ячейки для произведения замены
     * @return массив после перемены местами элементов с индексами source и dest.
     */
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    /**
     * swapBorder метод меняет местами первый и последний элементы.
     * @param array : массив чисел
     * @return массив после перемены местами первого и последнего элемента
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /**
     * main точка входа в программу. Содержит тест метода swapBorder.
     * @param args массив строк
     */
    public static void main(String[] args) {
        int[] ints = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(ints);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
