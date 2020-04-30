package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenPointX0Y0AndPointX0Y2RblThenDistance2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 2;
        double expected = 2.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPointX0Y0AndPointX0YMinus2RblThenDistance2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = -2;
        double expected = 2.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPointXMinus2Y0AndPointX0YMinus2RblThenDistance2dot83() {
        int x1 = -2;
        int y1 = 0;
        int x2 = 0;
        int y2 = -2;
        double expected = 2.83;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPointX1Y0AndPointX1Y1RblThenDistance1() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 1;
        int y2 = 1;
        double expected = 1.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPointX1Y1AndPointX1Y1RblThenDistance0() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        double expected = 0.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}