package ru.job4j.collection.search;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenPriorityEquals() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("task", 3));
        queue.put(new Task("new task", 3));
        queue.put(new Task("new new task", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("task"));
    }

    @Test
    public void whenSameEqualsPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("task1", 4));
        queue.put(new Task("task2", 3));
        queue.put(new Task("task3", 1));
        queue.put(new Task("new task1", 4));
        for (int i = 0; i < 3; i++) {
            queue.take();
        }
        Task result = queue.take();
        assertThat(result.getDesc(), is("new task1"));
    }
}