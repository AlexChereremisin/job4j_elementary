package ru.job4j.collection.sort;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobDescByPriorityReverseOrderTest {

    @Test
    public void compareWhenGreat() {
        Comparator<Job> cmpNamePriority = new JobDescByPriorityReverseOrder();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void compareWhenLess() {
        Comparator<Job> cmpNamePriority = new JobDescByPriorityReverseOrder();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void compareWhenEquals() {
        Comparator<Job> cmpNamePriority = new JobDescByPriorityReverseOrder();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, is(0));
    }
}