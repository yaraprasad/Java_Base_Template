package com.java.version.eight.streams.level.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurences {
    public static void main(String[] args) {
    //Q. count occurrences of each elements in the list.
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        //apple - 3, banana -2 , orange -1

        Map<String, Long> countOccurrences = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countOccurrences);
        //{orange=1, banana=2, apple=3}
    }
}
