package com.java.version.eight.streams.level.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountGreaterThanN {
    public static void main(String[] args) {

        //Q. Count how many numbers are greater than 5 in list
        List<Integer> numbers = Arrays.asList(2,6,3,8,10,1);
        // 6,8,10
        long result = numbers.stream().filter(n -> n > 5).count();
        System.out.println(result); //3

        // how about duplicate numbers, but unique values
        List<Integer> numbers1 = Arrays.asList(2,6,3,8,10,1,8,4,3,8,2,6,1,10);
        long result1 = numbers1.stream().distinct().filter(n -> n > 5).count();
        System.out.println(result1); //3  without distinct output is 7
    }
}
