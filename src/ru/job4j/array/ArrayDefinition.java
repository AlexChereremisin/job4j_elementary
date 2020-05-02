package ru.job4j.array;

/**
 * ArrayDefinition класс для отработки создания массивов
 * @author Alexey Cheremisin
 * @since 02.05.2020
 * @version 1
 */
public class ArrayDefinition {
    /**
     * main - точка входа в программу. Содержит примеры создания массивов.
     * @param args - массив строк
     */
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Andrey Petrov";
        names[2] = "Sergey Tolstov";
        names[3] = "Svetlana Kuznetsova";
    }
}
