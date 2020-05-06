package ru.job4j.array;

/**
 * MatrixCheck класс содержит методы проверки заполнения строки/столбца в двумерном массиве символом 'X'.
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

    /**
     * monoVertical метод проверки заполнен ли столбец из двумерного массива символоми 'X'
     * @param board : двумерный массив символов.
     * @param column : столбец в двумерном массиве, который будем проверять на заполнение.
     * @return true если все символы в столбце 'X', false если не все 'X'.
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * extractDiagonal метод заполняет одномерный массив элементами из диагонали двумерного массива.
     * @param board : двумерный массив символов.
     * @return одномерный массив из элементов диагонали массива board[i][j].(диагональю считаем элементы с индексами i == j).
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }
}
