package org.example.Task4Module6.Ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoMap {
    public static void main(String[] args) {
        ArrayList<String> firstTeam = new ArrayList<>(Arrays.asList("Charles", "Evelyn", "Madison", "Lily"));
        ArrayList<String> secondTeam = new ArrayList<>(Arrays.asList("Mila", "Isabella", "Lucy", "Logan"));

        List<String> combineList = Stream.of(firstTeam, secondTeam).flatMap(Collection::stream).sorted().collect(Collectors.toList());

        System.out.println(combineList);
    }
}