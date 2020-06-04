package ru.job4j.array;

/**
 * Defragment класс содержит метод дефрагментирующий одномерный массив.
 * @author Alexey Cheremisin
 * @since 07.05.2020
 * @version 1
 */
public class Defragment {
    /**
     * compress(String[] array) метод дефрагментаци одномерного массива.
     * Сдвигает не null элементы в начало массива.
     * @param array массив строк.
     * @return дефрагментированный массив. Все не null элементы находятся в начале массива.
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                while (array[point] == null) {
                    if (++point >= array.length) {
                        --point;
                        break;
                    }
                }
                String tmp = array[index];
                array[index] = array[point];
                array[point] = tmp;
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    /**
     * main(String[] args) точка входа в программу.
     * Содержит тест для метода compress(String[] array).
     * @param args массив строк.
     */
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
