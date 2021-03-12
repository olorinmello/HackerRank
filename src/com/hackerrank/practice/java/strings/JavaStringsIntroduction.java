package com.hackerrank.practice.java.strings;

import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(a.length() + b.length());
        System.out.println( a.compareTo(b) > 0 ? "Yes": "No");
        String a1 = a.substring(0, 1).toUpperCase();
        String aCapitalized = a1 + a.substring(1);
        String b1 = b.substring(0, 1).toUpperCase();
        String bCapitalized = b1 + b.substring(1);
        System.out.println( aCapitalized + " " + bCapitalized);

    }

}