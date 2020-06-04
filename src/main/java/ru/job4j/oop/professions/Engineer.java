package ru.job4j.oop.professions;

public class Engineer extends Profession {
    public Engineer(String qualification) {
        super(qualification);
    }

    public Engineer(String qualification, int experience) {
        super(qualification, experience);
    }

    public TechnicalTask getTask(Client client) {
        return null;
    }
}
