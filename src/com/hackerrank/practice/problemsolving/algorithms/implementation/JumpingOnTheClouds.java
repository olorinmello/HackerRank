package com.hackerrank.practice.problemsolving.algorithms.implementation;

import java.io.IOException;
import java.util.Scanner;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumpCounter = 0;
        for (int i = 0; i < c.length;){
            if ((i + 2) <= c.length-1) {
                if (c[i + 2] == 0) {
                    i = i + 2;
                } else if (c[i + 2] == 1) {
                    i++;
                }
                jumpCounter++;
            }else {
                i++;
                if (i <= c.length - 1) {
                    jumpCounter++;
                }
            }
        }
        return jumpCounter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] c = new int[n];
//
//        String[] cItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int cItem = Integer.parseInt(cItems[i]);
//            c[i] = cItem;
//        }

        int n = 6;
        int[] c = new int[]{0, 0, 0, 1, 0, 0};
        int result = jumpingOnClouds(c);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
