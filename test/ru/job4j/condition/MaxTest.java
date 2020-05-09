package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1And2And3And4Then4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1And4And2And3Then4() {
        int result = Max.max(1, 4, 2, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax4And1And2And3Then4() {
        int result = Max.max(4, 1, 2, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenAll4Then4() {
        int result = Max.max(4, 4, 4, 4);
        assertThat(result, is(4));
    }
}