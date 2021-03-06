package ru.job4j.lambda.filter;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class School {
    public static List<Student> collect(final List<Student> students, final Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }
}
