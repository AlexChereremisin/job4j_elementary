package ru.job4j.array;

/**
 * BarleyBreak класс-пример работы с двухмерным массивом.
 * @author Alexey Cheremisin
 * @since 06.05.2020
 * @version 1
 */
public class BarleyBreak {
    /**
     * main точка входа в программу.
     * Содержит пример работы с двухмерным масвсивом.
     * @param args : массив строк.
     */
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        int count = 1;
        for (int row = 0; row < numbers.length; row++) {
            for (int cell = 0; cell < numbers[row].length; cell++) {
                numbers[row][cell] = count;
                count++;
            }
        }

        for (int[] row : numbers) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
