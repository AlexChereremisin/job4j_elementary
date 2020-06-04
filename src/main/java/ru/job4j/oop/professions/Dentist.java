package ru.job4j.oop.professions;

public class Dentist extends Doctor {
    public Dentist(String qualification) {
        super(qualification);
    }

    public Dentist(String qualification, int experience) {
        super(qualification, experience);
    }

    public void treatTeeth(Diagnose diagnose, Pacient pacient) {
    }
}
