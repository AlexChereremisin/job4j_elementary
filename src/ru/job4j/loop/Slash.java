package ru.job4j.loop;

/**
 * Slash Класс для рисования креста Х в псевдографике.
 * @author Alexey Cheremisin
 * @since 02.05.2020
 * @version 1
 */
public class Slash {
    /**
     * draw метод для отрисовки креста Х в псевдографике.
     * @param size - размер стороны квадратного поля в котором будет рисоваться крест.
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell;
                boolean right = cell == ((size - 1) - row);
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * main точка входа в программу с тестами метода draw внутри.
     * @param args - args.
     */
    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
        System.out.println("Draw by 7");
        draw(7);
        System.out.println("Draw by 8");
        draw(8);
        System.out.println("Draw by 9");
        draw(9);
        System.out.println("Draw by 6");
        draw(6);
    }
}
