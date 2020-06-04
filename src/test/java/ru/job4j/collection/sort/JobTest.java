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
                new Job("B", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenReversePriorityAndName() {
        Comparator<Job> cmpNamePriority = new JobDescByPriorityReverseOrder().thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("A", 1),
                new Job("B", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenPriorityAndName() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("B", 2),
                new Job("C", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenPriorityReverseAndNameReverse() {
        Comparator<Job> cmpNamePriority = new JobDescByPriorityReverseOrder().thenComparing(new JobDescByNameReverseOrder());
        int rsl = cmpNamePriority.compare(
                new Job("B", 4),
                new Job("C", 4)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenReverseNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByNameReverseOrder().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Aa", 2),
                new Job("Aa", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenNameAndReversePriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriorityReverseOrder());
        int rsl = cmpNamePriority.compare(
                new Job("Aa", 2),
                new Job("Aa", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Aa", 2),
                new Job("Aa", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenNameReverseAndPriorityReverse() {
        Comparator<Job> cmpNamePriority = new JobDescByNameReverseOrder().thenComparing(new JobDescByPriorityReverseOrder());
        int rsl = cmpNamePriority.compare(
                new Job("Aa", 2),
                new Job("Aa", 1)
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