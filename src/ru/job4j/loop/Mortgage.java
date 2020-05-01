package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        double allCredit  = amount * (percent / 100) + amount;
        while (allCredit - salary > 0) {
            allCredit -= salary;
            allCredit += allCredit * (percent / 100);
            year++;
        }
        return year;
    }
}
