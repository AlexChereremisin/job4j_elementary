package ru.job4j.array;

/**
 * ArrayChar класс содержит метод проверяющий, содержит ли массив данный подмассив.
 * @author Alexey Cheremisin
 * @since 05.05.2020
 * @version 1
 */
public class ArrayChar {
    /**
     * startsWith метод проверки равенства массива и данного подмассива начиная с 0 индекса.
     * @param word : массив символов, в нем будем искать совпадение с массивом pref.
     * @param pref : массив символов, проверяемый на совпадение с word начиная с 0 индекса.
     * @return true если массив word содержит массив pref начиная с 0 индекса, false если это не так.
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
