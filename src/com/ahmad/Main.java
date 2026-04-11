package com.ahmad;

public class Main {
    public static void main(String[] args) {
        Student ahmad = new Student("Ahmad ", "ahmad@gmail.com", "Ahmad@786",8.32);
        ahmad.setResumeLink("www.ahmadportfolio.com");
        System.out.println(ahmad);
        System.out.println(ahmad.getId());
        System.out.println(ahmad.getCreatedAt());

        Student ankit = new Student("Ankit", "ankit@gmail.com", "pass", 8.32);
        ankit.setResumeLink("www.ankitportfolio.com");

        System.out.println("\n" + ankit);
        System.out.println(ankit.getId());
        System.out.println(ankit.getCreatedAt());

        Recruiter amit = new Recruiter("Amit", "amit@gmail.com", "Amit123$", "Google", "Software Engineer");
        amit.addJobPostings("Data Engineer", "Data Analyst");
        System.out.println("\n"+ amit);
    }
}
