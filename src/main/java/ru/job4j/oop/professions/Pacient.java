package ru.job4j.oop.professions;

public class Pacient {
    private int age;
    private String disease;

    public Pacient(int age, String disease) {
        this.age = age;
        this.disease = disease;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
