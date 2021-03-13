package com.hackerrank.practice.problemsolving.algorithms.implementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long missingStringLength = n % s.length();
        String missingString = s.substring(0,0+(int)missingStringLength);
        char[] missingChars = missingString.toCharArray();
        ArrayList<Character> missingCharList = new ArrayList<Character>();
        for (char missingChar:missingChars) {
            missingCharList.add(missingChar);
        }
        int numberOfOccuranceInMissingString = Collections.frequency(missingCharList,'a');

        long repeatedStringCount = n / s.length();
        char[] repeatedChars = s.toCharArray();
        ArrayList<Character> repeatedCharList = new ArrayList<Character>();
        for (char repeatedChar:repeatedChars) {
            repeatedCharList.add(repeatedChar);
        }
        int numberOfOccuranceInRepeatedString = Collections.frequency(repeatedCharList,'a');

        long numberOfAllOccurances = (numberOfOccuranceInRepeatedString * repeatedStringCount) + numberOfOccuranceInMissingString;
        return numberOfAllOccurances;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = scanner.nextLine();
//
//        long n = scanner.nextLong();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long n = 1000000000000L;
        String s = "a";
        long result = repeatedString(s, n);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
