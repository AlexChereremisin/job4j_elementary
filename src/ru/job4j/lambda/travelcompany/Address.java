package ru.job4j.lambda.travelcompany;

public final class Address {
    private final String city;
    private final String street;
    private final int home;
    private final int apartment;

    public Address(
            final String city,
            final String street,
            final int home,
            final int apartment
    ) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Address{"
                + "city='" + city + '\''
                + ", street='" + street + '\''
                + ", home=" + home
                + ", apartment=" + apartment
                + '}';
    }
}
