package ru.job4j.oop.professions;

public class Surgeon extends Doctor {
    public Surgeon(String qualification) {
        super(qualification);
    }

    public Surgeon(String qualification, int experience) {
        super(qualification, experience);
    }

    public void surgery(Diagnose diagnose, Pacient pacient) {
    }
}
