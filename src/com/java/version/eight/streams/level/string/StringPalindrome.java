package com.java.version.eight.streams.level.string;

import java.util.stream.IntStream;

public class StringPalindrome {

    public static void main(String[] args) {

        String msg = "MALAYALAM";

        boolean out = IntStream.range(0, msg.length() / 2)
                .noneMatch(i -> msg.charAt(i) != msg.charAt(msg.length() - i - 1));
        //System.out.println(" Is "+msg+" a palindrome using noneMatch? :  "+out);

        boolean out1 = IntStream.range(0, msg.length() / 2)
                .allMatch(i -> msg.charAt(i) == msg.charAt(msg.length() - i - 1));

        //System.out.println(" Is "+msg+" a palindrome using allMatch? : "+out1);
        
    }
}
