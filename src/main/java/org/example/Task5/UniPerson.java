package org.example.Task5;

// import com.sun.tools.javac.util.List;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class UniPerson {
    static class Person {
        public final String firstName;
        public final String lastName;
        public final Integer age;

        public Person(String firstName, String lastName, Integer age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

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

            List<String> personFirstName = people
                    .stream()
                    .filter((person) -> personList)
                    .collect(Collectors.toList());

            System.out.println(personFirstName);
        }
    }
}
