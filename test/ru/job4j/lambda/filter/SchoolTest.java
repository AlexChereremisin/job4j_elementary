package ru.job4j.lambda.filter;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SchoolTest {
    private static List<Student> students = new ArrayList<>();

    @BeforeClass
    public static void init() {
        students.add(new Student("Petrov", 98));
        students.add(new Student("Udalova", 70));
        students.add(new Student("Sidorov", 65));
        students.add(new Student("Smirnova", 50));
        students.add(new Student("Ivanov", 45));
        students.add(new Student("Ivanova", 15));
        students.add(new Student("Shatkova", 0));
    }

    @Test
    public void classA() {
        Predicate<Student> predicate = student -> student.getScore() >= 70 && student.getScore() <= 100;
        List<Student> result = School.collect(students, predicate);
        for (Student student : result) {
            assertThat(student.getScore(), greaterThanOrEqualTo(70));
        }
    }

    @Test
    public void classB() {
        Predicate<Student> predicate = student -> student.getScore() >= 50 && student.getScore() < 70;
        List<Student> result = School.collect(students, predicate);
        for (Student student : result) {
            assertThat(student.getScore(), greaterThanOrEqualTo(50));
            assertThat(student.getScore(), lessThan(70));
        }
    }

    @Test
    public void classC() {
        Predicate<Student> predicate = student -> student.getScore() > 0 && student.getScore() < 50;
        List<Student> result = School.collect(students, predicate);
        for (Student student : result) {
            assertThat(student.getScore(), greaterThan(0));
            assertThat(student.getScore(), lessThan(50));
        }
    }
}