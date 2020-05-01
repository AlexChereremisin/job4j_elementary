package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        if (number > 1) {
            prime = true;
            for (int index = 2; index <= number - 1; index++) {
                if (number % index == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}
