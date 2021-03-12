package com.hackerrank.practice.java.introduction;

import java.util.OptionalInt;
import java.util.Random;

public class JavaIntToString {

    //Write your code here
    public static void main(String[] args) {
        int n = getRandomNumberUsingInts(-100,100);
        String s = Integer.valueOf(n).toString();
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Wrong answer");
        }
        System.out.println("Good job");
    }

    public static int getRandomNumberUsingInts(int min, int max) {
        Random random = new Random();
        OptionalInt optionalInt = random.ints(min, max)
                .findFirst();
        int asInt = 0;
        if (optionalInt.isPresent()) {
            asInt = optionalInt.getAsInt();
        }

        return asInt;
    }

}
