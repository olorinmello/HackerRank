package com.hackerrank.practice.java.introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 0;
        while (sc.hasNext()) {
            lineNumber++;
            System.out.printf("%d %s%n", lineNumber, sc.nextLine());
            }
    }

}
