package ru.job4j.oop.professions;

public class Doctor extends Profession {
    public Doctor(String qualification) {
        super(qualification);
    }

    public Doctor(String qualification, int experience) {
        super(qualification, experience);
    }

    public Diagnose heal(Pacient pacient) {
        return null;
    }
}
