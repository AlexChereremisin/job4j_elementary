package ru.job4j.oop.professions;

public class Profession {
    private String qualification;
    private int experience;

    public Profession(String qualification) {
        super();
        this.qualification = qualification;
    }

    public Profession(String qualification, int experience) {
        this.qualification = qualification;
        this.experience = experience;
    }
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
