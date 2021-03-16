package com.hackerrank.practice.java.strings;

import java.io.IOException;
import java.util.Scanner;
//import java.util.*;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
//        List<String> subStrings = new ArrayList<>();
        String[] subStrings2 = {};

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i < s.length(); i++) {
            if (s.length()>= i+3) {
//                subStrings.add(s.substring(i, i+3));
                subStrings2[i] = s.substring(i, i+3);
            }
        }

//        subStrings.sort(String::compareTo);
//        subStrings2
//        smallest = subStrings.get(0);
//        largest = subStrings.get(subStrings.size()-1);
        return smallest + "\n" + largest;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
//        int n = 4;
//        int[] ar = {10, 9, 9, 8};
//
//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }
//        bufferedWriter.close();
//
////        scanner.close();
//
//        int result = sockMerchant(n, ar);
//        System.out.println(result);


}