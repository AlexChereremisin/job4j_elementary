package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP4AndK1Square1() {
        int p = 4;
        int k = 1;
        double expected = 1.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6AndK2Square2() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP1AndK1Square0dot0625() {
        int p = 1;
        int k = 1;
        double expected = 0.0625;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP0AndK0Square0() {
        int p = 0;
        int k = 0;
        double expected = 0.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4AndKMinus2SquareMinus8() {
        int p = 4;
        int k = -2;
        double expected = -8.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}