package ru.job4j.collection.sort;


import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobDescByNameReverseOrderTest {

    @Test
    public void compareWhenGreat() {
        Comparator<Job> cmpNamePriority = new JobDescByNameReverseOrder();
        int rsl = cmpNamePriority.compare(
                new Job("A", 2),
                new Job("B", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void compareWhenLess() {
        Comparator<Job> cmpNamePriority = new JobDescByNameReverseOrder();
        int rsl = cmpNamePriority.compare(
                new Job("B", 0),
                new Job("A", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void compareWhenEquals() {
        Comparator<Job> cmpNamePriority = new JobDescByNameReverseOrder();
        int rsl = cmpNamePriority.compare(
                new Job("C", 1),
                new Job("C", 1)
        );
        assertThat(rsl, is(0));
    }
}