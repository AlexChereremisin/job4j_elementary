package ru.job4j.testtask;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int inxCoin = 0; inxCoin != COINS.length; inxCoin++) {
            while ((change - COINS[inxCoin]) >= 0) {
                change -= COINS[inxCoin];
                rsl[size++] = COINS[inxCoin];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
