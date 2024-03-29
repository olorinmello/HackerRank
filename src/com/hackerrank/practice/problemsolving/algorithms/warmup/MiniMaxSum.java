package com.hackerrank.practice.problemsolving.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

        // Complete the miniMaxSum function below.
        static void miniMaxSum(int[] arr) {
            long maxFourSum = Arrays.stream(arr).sorted().asLongStream().skip(1).sum();
            long minFourSum = Arrays.stream(arr).sorted().asLongStream().limit(arr.length-1).sum();

            System.out.println(minFourSum + " " + maxFourSum);

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int[] arr = new int[5];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < 5; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            miniMaxSum(arr);

            scanner.close();
        }


}
