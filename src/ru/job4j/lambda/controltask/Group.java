package ru.job4j.lambda.controltask;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Group {
    public static Map<String, Set<String>> sections(final List<Student> students) {
        return students.stream().flatMap(
                s -> s.getUnits().stream()
                        .flatMap(unit -> Stream
                                .of(new Holder(unit, s.getName())))
        ).collect(
                Collectors.groupingBy(h -> h.key,
                        Collector.of(
                                HashSet::new,
                                (set, el) -> set.add(el.value),
                                (left, right) -> {
                                    left.addAll(right);
                                    return left;
                                }
                        )
                )
        );
    }

    static class Holder {
        String key, value;

        Holder(final String key, final String value) {
            this.key = key;
            this.value = value;
        }
    }
}
