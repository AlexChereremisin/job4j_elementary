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
        SwitchArray.swap(array, 0, 3);
        SwitchArray.swap(array, 1, 2);
        SwitchArray.swap(array, 3, 4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
