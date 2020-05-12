package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Консольная игра 11. Приветствует вас!");
        System.out.println("Правила:");
        System.out.println("\tИгра для двух игроков.");
        System.out.println("\tКаждый игрок в свой ход может взять от 1 до 3 спичек.");
        System.out.println("\tПобеда присваевается игроку взявшему последние спички со стола.");
        System.out.println();
        int count = 11;
        boolean isFirst = true;
        while (true) {
            System.out.printf("На столе %s спичек%s", count, System.lineSeparator());
            System.out.printf("Ход %s игрока! Возьмите от 1 до 3 спичек ", isFirst ? "первого" : "второго");
            count -= turn(count);
            if (count == 0) {
                System.out.printf("!!!Победил %s игрок!!!", isFirst ? "первый" : "второй");
                break;
            }
            isFirst = !isFirst;
        }
    }

    private static int turn(int count) {
        while (true) {
            int rsl = Integer.parseInt(input.nextLine());
            if (rsl >= 1 && rsl <= 3 && count - rsl >= 0) {
                return rsl;
            } else {
                System.out.printf("На столе %s спичек%s", count, System.lineSeparator());
                System.out.println("Вы взяли неверное количество спичек! Возьмите от 1 до 3 спичек либо оставшиеся.");
            }
        }
    }
}
