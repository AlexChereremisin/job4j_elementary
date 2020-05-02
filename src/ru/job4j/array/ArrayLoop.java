package ru.job4j.array;

/**
 * ArrayLoop класс для отработки заполнения/считывания массива через цикл.
 * @author Alexey Cheremisin
 * @since 02.05.2020
 * @version 1
 */
public class ArrayLoop {
    /**
     * main - точка входа в программу.
     * @param args : массив строк.
     */
    public static void main(String[] args) {
        int[] num = new int[5];
        for (int index = 0; index < num.length; index++) {
            num[index] = index * 2 + 3;
        }
        for (int index = 0; index < num.length; index++) {
            System.out.println(num[index]);
        }
    }
}
