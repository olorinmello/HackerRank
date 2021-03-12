package com.hackerrank.practice.problemsolving.algorithms.warmup;

import java.util.Scanner;

public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {

        for (int i = 1; i <= n; i++) {
            String line = lineGenerator(i, n);
            System.out.println(line);
        }

    }

    private static String lineGenerator(int lineNumber, int numberOfLines) {
        char space = ' ';
        char sharp = '#';
        return String.valueOf(space).repeat(Math.max(0, numberOfLines - lineNumber)) +
                String.valueOf(sharp).repeat(Math.max(0, lineNumber));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
