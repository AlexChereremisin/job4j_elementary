package ru.job4j.oop.polymorphism;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("The bus is going");
    }

    @Override
    public void passengers(int number) {
        System.out.printf("The bus carries %s passengers%s", number, System.lineSeparator());
    }

    @Override
    public double fullUp(double amount) {
        return amount * 41D;
    }
}
