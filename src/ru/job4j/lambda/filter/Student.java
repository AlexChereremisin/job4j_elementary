package ru.job4j.lambda.filter;

public final class Student {
    private String surname;
    private int score;

    public Student(final String surname, final int score) {
        this.surname = surname;
        this.score = score;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getScore() {
        return this.score;
    }
}
