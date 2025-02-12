package aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;


public class Resume <T extends Jobrole>{
    List<T> resumes;  // List to store resumes of type T

    // Constructor to initialize the resumes list
    public Resume() {
        resumes = new ArrayList<>();
    }

    // Method to add a resume to the list
    public void addResumes(T resume) {
        resumes.add(resume);
    }

    // Method to retrieve the list of resumes
    public List<T> getResumes() {
        return resumes;
    }


}
