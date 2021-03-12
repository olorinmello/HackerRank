package com.hackerrank.practice.java.datastructures;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    public static Comparator<Student> getCompByCgpaThenFnameThenId(){
        Comparator comp = new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2)
            {
                int result = 0;
                if (s1.cgpa > s2.cgpa) {
                    result = -1;
                } else if (s1.cgpa < s2.cgpa) {
                    result = 1;
                } else {
                    result = s1.fname.compareTo(s2.fname);
                    if (result == 0) {
                        if (s1.id > s2.id) {
                            result = 1;
                        } else {
                            result = -1;
                        }
                    }
                }
                return result;
            }
        };
        return comp;
    }
}

//Complete the code
public class JavaSort{
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
        int testCases = 5;
        int[] ids = {22, 19, 56, 85, 33};
        String[] fNames = {"Farim", "Samara", "Samiha", "Ashis", "Rumpa"};
        double[] cgpas = {3.76, 3.75, 3.75, 3.85, 3.68};

//        33 Rumpa 3.68
//        85 Ashis 3.85
//        56 Samiha 3.75
//        19 Samara 3.75
//        22 Fahim 3.76

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
//            int id = in.nextInt();
            int id = ids[testCases-1];
//            String fname = in.next();
            String fname = fNames[testCases-1];
//            double cgpa = in.nextDouble();
            double cgpa = cgpas[testCases-1];

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
//        Collections.sort(studentList, com.hackerrank.practice.java.datastructures.Student.getCompByCgpaThenFnameThenId());
        studentList.sort(Student.getCompByCgpaThenFnameThenId());
        for(Student st: studentList){
            System.out.println(st.getId() + " " + st.getFname()+ " " + st.getCgpa());
        }
    }
}