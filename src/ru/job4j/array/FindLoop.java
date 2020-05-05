package ru.job4j.array;

/**
 * FindLoop класс содержит методы осуществляющие поиск числа в массиве.
 * @author Alexey Cheremisin
 * @since 03.05.2020
 * @version 1
 */
public class FindLoop {
    /**
     * indexOf метод возвращает индекс найденного элемента в масиве data, если такого элемента нет, то -1.
     * @param data : массив с целыми числами.
     * @param el : число, которое надо найти в массиве.
     * @return индекс найденного числа в массиве, если такого элемента нет, то -1.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * indexOf метод поиска элемента в указанном диапазоне индексов массива.
     * @param data : массив с целыми числами.
     * @param el : число, которое надо найти в массиве.
     * @param start : индекс начала диапазона поиска.
     * @param finish : индекс конца диапазона поска.
     * @return ндекс найденного числа в массиве, если такого элемента нет или диапазон за границами массива, то -1.
     */
    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        int startIndex = Math.min(start, finish);
        int finishIndex = Math.max(start, finish);
        boolean condition = startIndex >= 0 && finishIndex < data.length;
        while (startIndex <= finishIndex && condition) {
            if (data[startIndex] == el) {
                rst = startIndex;
                break;
            }
            startIndex++;
        }
        return rst;
    }
}
