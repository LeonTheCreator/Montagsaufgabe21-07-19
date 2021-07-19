package com.mycompany.app;

import com.mycompany.model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Peter", 42, "125125");

        String var = student.toString();
        System.out.println(var);
    }
}
