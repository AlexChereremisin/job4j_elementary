package ru.job4j.array;

/**
 * Check класс содержит метод проверяющий массив на одинаковые элементы.
 * @author Alexey Cheremisin
 * @since 05.05.2020
 * @version 1
 */
public class Check {
    /**
     * mono метод проверяющий массив boolean[] на одинаковые элементы.
     * @param data : массив типа boolean.
     * @return true если все элементы одинаковы и false если неодинаковы.
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 1; index < data.length; index++) {
            if (data[index] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
