package ru.job4j.oop.professions;

public class Builder extends Engineer {
    public Builder(String qualification) {
        super(qualification);
    }

    public Builder(String qualification, int experience) {
        super(qualification, experience);
    }

    public void build(TechnicalTask technicalTask) {

    }
}
