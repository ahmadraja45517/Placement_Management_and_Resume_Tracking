package com.ahmad;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InvalidCGPAException {

        try {
            Student ahmad = new Student("Ahmad", "ahmad@gmail.com", "pass", 9.5);
            ahmad.setResumeLink("www.ahmadportfolio.com");
            System.out.println(ahmad);
            System.out.println(ahmad.getStatus());
            System.out.println(ahmad.getId());
            System.out.println(ahmad.getCreatedAt());

            // moved the API response in here too, because it needs 'ahmad'
            ApiResponse<Student> studentBox = new ApiResponse<>(200, "Successfully fetched student profile!", ahmad);
            System.out.println("\n" + studentBox);

        } catch (InvalidCGPAException e) {
            System.out.println("Error creating Ahmad: " + e.getMessage());
        }

        // --- The rest of the code works now because of the 'throws' on the main method ---

        Student ankit = new Student("Ankit", "ankit@gmail.com", "pass", 8.32);
        ankit.setResumeLink("www.ankitportfolio.com");
        System.out.println("\n" + ankit);

        Recruiter amit = new Recruiter("Amit", "amit@gmail.com", "Amit123$", "Google", "Software Engineer");
        amit.addJobPostings("Data Engineer", "Data Analyst");

        User loggedInUser = new Student("Guest", "guest@gmail.com", "pass123", 8.5);

        if (loggedInUser instanceof Student) {
            System.out.println("Routing to Student Portal...");
        } else if (loggedInUser instanceof Recruiter) {
            System.out.println("Routing to HR Dashboard...");
        }

        ApiResponse<Recruiter> recruiterBox = new ApiResponse<>(200, "Successfully fetched recruiter profile!", amit);
        System.out.println("\n" + recruiterBox);

        // --- Lambda Filtering ---
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("alok", "alok@gmail.com", "pass1", 9.53));
        students.add(new Student("Arnav", "arnav@gmail.com", "pass2", 6.53));
        students.add(new Student("Aditya", "aditya@gmail.com", "pass3", 7.49));
        students.add(new Student("Anish", "anish@gmail.com", "pass4", 8.53));

        // Instantly removes Arnav and Aditya!
        students.removeIf(student -> student.getCgpa() < 7.5);

        for (Student s : students) {
            System.out.println("\n" + s);
        }
    }
}