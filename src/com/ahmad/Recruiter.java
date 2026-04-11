package com.ahmad;
import java.util.ArrayList;
import java.util.Arrays;

public class Recruiter extends User{
    private String companyName;
    private ArrayList<String> jobPostings;

    public Recruiter(String name, String email, String password, String companyName, String... jobs){
        super(name, email, password);
        this.companyName = companyName;
        this.jobPostings = new ArrayList<>(Arrays.asList(jobs));
    }

    @Override
    public String toString() {
        return "Recruiter Details:\n" +
                "Name: " + getName() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Company name: " + getCompanyName() + "\n" +
                "Job Posting: " + getJobPostings() + "\n" +
                "Dashboard: " + getDashboardUrl();
    }

    public String getCompanyName(){
        return companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public ArrayList<String> getJobPostings(){
        return jobPostings;
    }

    // Erases the old list and sets a brand new one
    public void setJobPostings(String... jobs){
        this.jobPostings = new ArrayList<>(Arrays.asList(jobs));
    }

    // Appends multiple new jobs without erasing the old ones
    public void addJobPostings(String... newJobs) {
        if (this.jobPostings != null) {
            this.jobPostings.addAll(Arrays.asList(newJobs));
        }
    }

    @Override
    public String getDashboardUrl(){
        return "/company/dashboard";
    }
}