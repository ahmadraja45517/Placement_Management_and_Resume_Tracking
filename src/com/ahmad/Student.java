package com.ahmad;

public class Student extends User implements Auditable, Exportable{
    private double cgpa;
    private String resumeLink;
    private ApplicationStatus status;

    public Student(String name, String email, String password, double cgpa, String... resumeLink) throws InvalidCGPAException{
        super(name, email, password);
        setCgpa(cgpa);
        if (resumeLink.length > 0) {
            this.resumeLink = resumeLink[0];
        }
        this.status = ApplicationStatus.PENDING;
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

    public void setCgpa(double cgpa) throws InvalidCGPAException{
        if(cgpa >= 0 && cgpa <= 10){
            this.cgpa = cgpa;
        }else{
            throw new InvalidCGPAException("CGPA must be between 0 and 10");
        }
    }

    public String getResumeLink(){
        return resumeLink != null ? resumeLink : "Not uploaded";
    }

    public void setResumeLink(String resumeLink){
        this.resumeLink = resumeLink;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
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
