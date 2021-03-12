package com.hackerrank.practice.problemsolving.algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

        // Complete the plusMinus function below.
        static void plusMinus(int[] arr) {
            double positiveCounter = 0, negativeCounter = 0, zeroCounter = 0;
            double arrayLength = arr.length;

            for (int j : arr) {
                if (j > 0) {
                    positiveCounter++;
                } else if (j < 0) {
                    negativeCounter++;
                } else {
                    zeroCounter++;
                }
            }
            double proportionPositive = positiveCounter / arrayLength;
            double proportionNegative = negativeCounter / arrayLength;
            double proportionZero = zeroCounter / arrayLength;

            System.out.printf("%.06f%n", proportionPositive);
            System.out.printf("%.06f%n", proportionNegative);
            System.out.printf("%.06f%n", proportionZero);

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            plusMinus(arr);

            scanner.close();
        }
}
