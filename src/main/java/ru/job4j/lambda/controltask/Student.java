package ru.job4j.lambda.controltask;

import java.util.Set;

public final class Student {
    private String name;
    private Set<String> units;

    public Student(final String name, final Set<String> units) {
        this.name = name;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public Set<String> getUnits() {
        return units;
    }
}
