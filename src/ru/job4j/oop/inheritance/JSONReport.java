package ru.job4j.oop.inheritance;

public class JSONReport extends TextReport {
    public String generate(String name, String body) {
        return "{\nname : " + name + ",\n" + "body : " + body + "\n}";
    }
}
