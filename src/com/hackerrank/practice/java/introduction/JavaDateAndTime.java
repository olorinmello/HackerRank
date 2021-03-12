package com.hackerrank.practice.java.introduction;

import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

class Result {

    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return dayOfWeek.name().toUpperCase();
    }

}
public class JavaDateAndTime {

    public static void main(String[] args) throws IOException {

        String[] firstMultipleInput = {"08","05","2015"};
        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        System.out.println(res);

    }
}
