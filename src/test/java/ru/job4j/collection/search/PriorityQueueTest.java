package ru.job4j.collection.search;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        var queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        var result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenPriorityEquals() {
        var queue = new PriorityQueue();
        queue.put(new Task("task", 3));
        queue.put(new Task("new task", 3));
        queue.put(new Task("new new task", 3));
        var result = queue.take();
        assertThat(result.getDesc(), is("task"));
    }

    @Test
    public void whenSameEqualsPriority() {
        var queue = new PriorityQueue();
        queue.put(new Task("task1", 4));
        queue.put(new Task("task2", 3));
        queue.put(new Task("task3", 1));
        queue.put(new Task("new task1", 4));
        for (int i = 0; i < 3; i++) {
            queue.take();
        }
        var result = queue.take();
        assertThat(result.getDesc(), is("new task1"));
    }
}