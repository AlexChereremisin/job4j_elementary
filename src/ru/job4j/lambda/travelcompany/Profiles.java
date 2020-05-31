package ru.job4j.lambda.travelcompany;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class Profiles {
    public static List<Address> collect(final List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
}
