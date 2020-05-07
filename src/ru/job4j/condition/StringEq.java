package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
        String root = new String("root");
        boolean access = login.equals(root);
        return access;
    }

    public static void main(String[] args) {
        String your = "your_name";
        boolean check = StringEq.check(your);
        System.out.println(check);
    }
}
