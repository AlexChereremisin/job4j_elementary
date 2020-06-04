package ru.job4j.lambda.controltask;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GroupTest {
    @Test
    public void when2GroupAnd2Students() {
        List<Student> students = List.of(
                new Student("Aleks", Set.of("literature", "gym")),
                new Student("Anna", Set.of("literature", "gym"))
        );
        Map<String, Set<String>> rsl = Group.sections(students);
        Map<String, Set<String>> expected = Map.of(
                "literature", Set.of("Aleks", "Anna"),
                "gym", Set.of("Aleks", "Anna")
        );
        assertThat(rsl, is(expected));
    }
}
