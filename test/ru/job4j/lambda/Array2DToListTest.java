package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Array2DToListTest {
    @Test
    public void array2DToList() {
        Integer[][] array2D = {
                {1, 2},
                {5, 7}
        };
        List<Integer> expected = List.of(1, 2, 5, 7);
        List<Integer> result = Array2DToList.array2DToList(array2D);
        assertThat(result, is(expected));
    }
}