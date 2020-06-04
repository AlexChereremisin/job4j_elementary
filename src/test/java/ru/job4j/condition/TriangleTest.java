package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void whenExist() {
        Triangle triangle = new Triangle(new Point(1, 1), new Point(1, 3), new Point(3, 3));
        double result = triangle.area();
        double expected = 1.99;
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenNotExist() {
        Triangle triangle = new Triangle(new Point(1, 1), new Point(2, 2), new Point(3, 3));
        double result = triangle.area();
        double expected = -1;
        assertEquals(expected, result, 0.01);
    }
}