package com.ahmad;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student ahmad = new Student("Ahmad ", "ahmad@gmail.com", "Ahmad@786",8.32);
        ahmad.setResumeLink("www.ahmadportfolio.com");
        System.out.println(ahmad);

        System.out.println();

        Recruiter google = new Recruiter("Amit", "amit@gmail.com", "Amit123$", "Google");
        google.setJobPostings("Data Engineer", "Data Analyst");
        System.out.println(google);
    }
}
