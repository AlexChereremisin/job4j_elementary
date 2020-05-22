package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("acheremisin@yandex.ru", "Cheremisin Alexey Arturovich");
        for (String s : map.keySet()) {
            String value = map.get(s);
            System.out.printf("%s : %s%n", s, value);
        }
    }
}
