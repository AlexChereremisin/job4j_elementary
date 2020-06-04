package ru.job4j.testtask;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MachineTest {
    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by36() {
        Machine machine = new Machine();
        int[] expected = {10, 2, 2};
        int[] rsl = machine.change(50, 36);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by37() {
        Machine machine = new Machine();
        int[] expected = {10, 2, 1};
        int[] rsl = machine.change(50, 37);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when100by32() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 10, 10, 10, 5, 2, 1};
        int[] rsl = machine.change(100, 32);
        assertThat(rsl, is(expected));
    }
}
