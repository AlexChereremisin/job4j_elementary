package ru.job4j.array;

/**
 * FindLoop класс содержит метод осуществляющий поиск заданного числа в массиве.
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
}
