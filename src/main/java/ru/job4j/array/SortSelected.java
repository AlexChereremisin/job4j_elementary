package ru.job4j.array;

/**
 * SortSelected класс содержит метод сортировки.
 * @author Alexey Cheremisin
 * @since 06.05.2020
 * @version 1
 */
public class SortSelected {
    /**
     * sort метод сортировки выборкой. От меньшего к большему.
     * @param data : массив чисел, который нужно отсортировать.
     * @return массив отсортированный по возрастанию.
     */
    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            int minIndex = FindLoop.indexOf(data, min, index, data.length - 1);
            SwitchArray.swap(data, index, minIndex);
        }
        return data;
    }
}
