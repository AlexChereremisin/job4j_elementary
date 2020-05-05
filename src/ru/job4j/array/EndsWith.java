package ru.job4j.array;

/**
 * EndsWith класс содержит метод проверяющий, содержит ли массив данный подмассив.
 * @author Alexey Cheremisin
 * @since 05.05.2020
 * @version 1
 */
public class EndsWith {
    /**
     * endsWith метод проверки равенства массива и данного подмассива начиная с (word.length - post.length) индекса.
     * @param word : массив символов, в нем будем искать совпадение с массивом post.
     * @param post : массив символов, проверяемый на совпадение с word начиная с (word.length - post.length) индекса.
     * @return true если массив word содержит массив post начиная с (word.length - post.length) индекса, false если это не так.
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (word[word.length - post.length + index] != post[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
