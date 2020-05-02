package ru.job4j.array;

/**
 * Square класс содержит метод заполнения массива квадратами чисел от 0 до указанного числа.
 * @author Alexey Cheremisin
 * @since 03.05.2020
 * @version 1
 */
public class Square {
    /**
     * calculate метод заполняющий массив из целых чисел квадратами чисел от 0 до переданного в метод.
     * @param bound : число, до которого надо заполнять массив квадратами начиная с 0.
     * @return : массив заполненый квадратами от 0 до bound.
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < bound; index++) {
            rst[index] = index * index;
        }
        return rst;
    }

    /**
     * main точка входа в программу.
     * @param args : массив строк.
     */
    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
