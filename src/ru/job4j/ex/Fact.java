package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        int rsl = new Fact().calc(-5);
        System.out.println(rsl);
    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is calculated only for numbers greater than 0.");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
