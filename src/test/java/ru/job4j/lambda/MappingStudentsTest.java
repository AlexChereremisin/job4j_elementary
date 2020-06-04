package ru.job4j.lambda;

import org.junit.Test;
import ru.job4j.lambda.filter.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MappingStudentsTest {
    @Test
    public void studentsToMap() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Petrova", 98));
        studentList.add(new Student("Udalova", 70));
        studentList.add(new Student("Petrova", 98));
        Map<String, Student> expected = new HashMap<>();
        expected.put(studentList.get(0).getSurname(), studentList.get(0));
        expected.put(studentList.get(1).getSurname(), studentList.get(1));
        Map<String, Student> result = new HashMap<>(MappingStudents.studentsToMap(studentList));
        assertThat(result, is(expected));
    }
}