package ru.job4j.collection.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(final String key) {
        Predicate<Person> equalsName = person -> person.getName().contains(key);
        Predicate<Person> equalsSurname = person -> person.getSurname().contains(key);
        Predicate<Person> equalsPhone = person -> person.getPhone().contains(key);
        Predicate<Person> equalsAddress = person -> person.getAddress().contains(key);
        Predicate<Person> combine = equalsName.or(equalsSurname.or(equalsPhone.or(equalsAddress)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
