package ru.job4j.array;

/**
 * AlgoArray класс для отработки перестановок элементов в массиве.
 * @author Alexey Cheremisin
 * @since 03.05.2020
 * @version 1
 */
public class AlgoArray {
    /**
     * main точка входа в программу. С примером перестановок внутри массива.
     * @param args : массив строк
     */
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0]; // переменная для временного хранения значение ячейки с индексом 0.
        array[0] = array[3]; // записываем в ячейку с индексом 0 значение ячейки с индексом 3.
        array[3] = temp; // записываем в ячейку с индексом 3 значение временной переменной.

        temp = array[1];
        array[1] = array[2];
        array[2] = temp;

        temp = array[3];
        array[3] = array[4];
        array[4] = temp;

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
