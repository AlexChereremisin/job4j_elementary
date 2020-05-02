package ru.job4j.converter;

/**
 * Converter Класс для конвертации раблей в евро и доллар.
 *
 * @author Alexey Cheremisin
 * @since 30.04.2020
 * @version 1
 */
public class Converter {
    /**
     * rubleToEuro переводит рубли в евро.
     * @param value - количество рублей.
     * @return количество евро по курсу euro = 70 rub.
     */
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * rubleToDollar переводит рубли доллары.
     * @param value - количество рублей.
     * @return количество долларов по курсу dollar = 60 rub.
     */
    public static int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * main точка входа в программу с парой тестов внутри
     * @param args - массив строк
     */
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        in = 180;
        expected = 3;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3. Test result : " + passed);
    }
}
