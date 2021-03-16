package com.hackerrank.practice.java.strings;

import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reverseA = "";
        for(int i = A.length() - 1; i >= 0; i--){
            reverseA = reverseA + A.charAt(i);
        }
        if(reverseA.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}