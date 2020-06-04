package ru.job4j.lambda;

import ru.job4j.lambda.filter.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MappingStudents {
    public static Map<String, Student> studentsToMap(final List<Student> studentList) {
        return studentList.stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        s -> s,
                        (s1, s2) -> s1
                ));
    }
}
