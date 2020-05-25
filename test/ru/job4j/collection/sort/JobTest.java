package ru.job4j.collection.sort;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenPriorityAndReverseName() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority().thenComparing(new JobDescByNameReverseOrder());
        int rsl = cmpNamePriority.compare(
                new Job("A", 2),
                new Job("B", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenReversePriorityAndName() {
        Comparator<Job> cmpNamePriority = new JobDescByPriorityReverseOrder().thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("A", 2),
                new Job("B", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenPriorityAndName() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("B", 2),
                new Job("C", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenPriorityReverseAndNameReverse() {
        Comparator<Job> cmpNamePriority = new JobDescByPriorityReverseOrder().thenComparing(new JobDescByNameReverseOrder());
        int rsl = cmpNamePriority.compare(
                new Job("B", 2),
                new Job("C", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenAllComparators() {
        Comparator<Job> cmpNamePriority =
                new JobDescByPriority()
                .thenComparing(new JobDescByName())
                .thenComparing(new JobDescByPriorityReverseOrder())
                .thenComparing(new JobDescByNameReverseOrder());
        int rsl = cmpNamePriority.compare(
                new Job("B", 2),
                new Job("C", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}