package ru.job4j.lambda.travelcompany;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class Profiles {
    public static List<Address> collect(final List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .sorted(new Comparator<Address>() {
                    @Override
                    public int compare(Address o1, Address o2) {
                        return o1.getCity().compareTo(o2.getCity());
                    }
                })
                .distinct()
                .collect(Collectors.toList());
    }
}
