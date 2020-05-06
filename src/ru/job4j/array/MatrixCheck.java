package ru.job4j.array;

/**
 * MatrixCheck класс содержит метод проверки заполнения строки в двумерном массиве символом 'X'.
 * @author Alexey Cheremisin
 * @since 06.05.2020
 * @version 1
 */
public class MatrixCheck {
    /**
     * monoHorizontal метод проверки заполнина ли строка из двумерного массива символоми 'X'
     * @param board : двумерный массив символов.
     * @param row : строка в двумерном массиве, которою будем проверять на заполнение.
     * @return true если все символы в строке 'X', false если не все 'X'.
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
