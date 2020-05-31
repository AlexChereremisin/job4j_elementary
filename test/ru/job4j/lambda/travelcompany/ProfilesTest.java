package ru.job4j.lambda.travelcompany;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ProfilesTest {
    @Test
    public void collect() {
        List<Profile> profileList = new ArrayList<>();
        profileList.add(new Profile(new Address("N", "a", 1, 5)));
        profileList.add(new Profile(new Address("M", "b", 11, 7)));
        List<Address> expected = new ArrayList<>();
        for (Profile profile : profileList) {
            expected.add(profile.getAddress());
        }
        List<Address> result = Profiles.collect(profileList);
        for (int index = 0; index < expected.size(); index++) {
            assertThat(result.get(index).toString(), is(expected.get(index).toString()));
        }
    }
}