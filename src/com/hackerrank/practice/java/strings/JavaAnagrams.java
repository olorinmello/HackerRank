package com.hackerrank.practice.java.strings;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        boolean result = true;
        if(a.length() == b.length()){
            java.util.SortedSet<String> sortedStringsA = new java.util.TreeSet<String>();
            java.util.SortedSet<String> sortedStringsB = new java.util.TreeSet<String>();
            java.util.List<String> StringsA = new java.util.ArrayList<String>();
            java.util.List<String> StringsB = new java.util.ArrayList<String>();
            for(int i = 0; i < a.length(); i++){
                sortedStringsA.add(a.substring(i, i+1).toLowerCase());
                sortedStringsB.add(b.substring(i, i+1).toLowerCase());
                StringsA.add(a.substring(i, i+1).toLowerCase());
                StringsB.add(b.substring(i, i+1).toLowerCase());
            }
            StringsA.sort(String::compareTo);
            StringsB.sort(String::compareTo);

            for(String ch : sortedStringsA ){
                if(java.util.Collections.frequency(StringsA, ch) !=
                        java.util.Collections.frequency(StringsB, ch)){
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }

        return result;
    }

}
