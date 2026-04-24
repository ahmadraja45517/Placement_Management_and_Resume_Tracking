package com.ahmad;

public class Student extends User implements Auditable, Exportable{
    private double cgpa;
    private String resumeLink;

    public Student(String name, String email, String password, double cgpa, String... resumeLink){
        super(name, email, password);
        setCgpa(cgpa);
        if (resumeLink.length > 0) {
            this.resumeLink = resumeLink[0];
        }
    }

    @Override
    public String toString() {
        return "Student Details:\n" +
                "Name: " + getName() + "\n" +
                "Email: " + getEmail() + "\n" +
                "CGPA: " + getCgpa() + "\n" +
                "Resume: " + getResumeLink() + "\n" +
                "Dashboard: " + getDashboardUrl();
    }

    public double getCgpa(){
        return cgpa;
    }

    public void setCgpa(double cgpa){
        if(cgpa >= 0 && cgpa <= 10){
            this.cgpa = cgpa;
        }else{
            System.out.println("Enter the valid CGPA!");
        }
    }

    public String getResumeLink(){
        return resumeLink != null ? resumeLink : "Not uploaded";
    }

    public void setResumeLink(String resumeLink){
        this.resumeLink = resumeLink;
    }

    @Override
    public String getDashboardUrl(){
        return "/student/dashboard";
    }

    @Override
    public void logActivity(String activity){
        System.out.println(activity + ": added resume link...");
    }

    @Override
    public void downloadProfile(String profile){
        System.out.println(profile + "summary");
    }
}
