package org.example.Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniPerson {

    public static void main(String[] args) {
        Person[] personList = {
                new Person("Peter", "Patterson", 21),
                new Person("Paul", "Walker", 31),
                new Person("Steve", "Runner", 17),
                new Person("Arnold", "", -1),
                new Person(" ", "Stevenson", 19),
                new Person("   ", "Stevenson", 19),
                new Person("      ", "Stevenson", 19),
                new Person(" Arnold", "Stevenson", 19),
                new Person("Aaron", "Bortnicker", 18),
        };
        List<Person> people = new ArrayList<>(Arrays.asList(personList));

        List<String> personFirstName = people.stream()
                .filter(person -> person.getAge() >= 18)
                .filter(person -> !person.getFirstName().isBlank() && !person.getFirstName().isEmpty())
                .map(person -> person.getFirstName().toUpperCase().replaceAll(" ", ""))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(personFirstName);
    }
}
