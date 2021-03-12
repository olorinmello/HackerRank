package com.hackerrank.practice.problemsolving.algorithms.warmup;

import java.io.*;
import java.util.*;

public class AVeryBigSum {


    public static final String OUTPUT_PATH = "C:/dev/code/HackerRank-master/resources/";
    public static final String OUTPUT_FILE =  OUTPUT_PATH + AVeryBigSum.class.getSimpleName();

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for (long l : ar) {
            sum += l;
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.setProperty("OUTPUT_FILE",OUTPUT_FILE);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT_FILE));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] ar = new long[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arItems[i]);
            ar[i] = arItem;
        }

        long result = aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}