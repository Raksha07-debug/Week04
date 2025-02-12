package aidrivenresumescreeningsystem;

public class AiDrivenResumeScreeningSystem {
    public static void main(String[] args) {
        SoftwareEngineer se= new SoftwareEngineer("Savi");
        ProductManager pm=new ProductManager("siya");
        DataScientist ds= new DataScientist("diya");

        Resume<SoftwareEngineer> seResume = new Resume<>();
        Resume<DataScientist> dsResume = new Resume<>();
        Resume<ProductManager> pmResume = new Resume<>();
        seResume.addResumes(se);
        dsResume.addResumes(ds);
        pmResume.addResumes(pm);

        // Displaying all resumes
        Utility.displayAll(seResume.getResumes());
        Utility.displayAll(dsResume.getResumes());
        Utility.displayAll(pmResume.getResumes());
    }
}
