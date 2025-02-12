package aidrivenresumescreening;

import aidrivenresumescreeningsystem.DataScientist;
import aidrivenresumescreeningsystem.ProductManager;
import aidrivenresumescreeningsystem.Resume;
import aidrivenresumescreeningsystem.Utility;

import aidrivenresumescreeningsystem.SoftwareEngineer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AiDrivenResumeScreeningTest {
    @Test
    void testSoftwareEngineer(){
        SoftwareEngineer se= new SoftwareEngineer("savi");
        assertEquals("savi",se.getName());
    }
    @Test
    void testDataScientist(){
        DataScientist ds= new DataScientist("siya");
        assertEquals("siya",ds.getName());
    }
     @Test
    void testProductManager(){
         ProductManager pm= new ProductManager("diya");
         assertEquals("diya",pm.getName());
     }
    @Test
    void testResume() {
        Resume<SoftwareEngineer> seResume = new Resume<>();
        SoftwareEngineer se = new SoftwareEngineer("Alice");
        seResume.addResumes(se);
        List<SoftwareEngineer> resumes = seResume.getResumes();
        assertEquals(1, resumes.size());
        assertEquals(se, resumes.get(0));
    }
    @Test
    void testUtility() {
        Resume<SoftwareEngineer> seResume = new Resume<>();
        SoftwareEngineer se = new SoftwareEngineer("Alice");
        seResume.addResumes(se);

        Resume<DataScientist> dsResume = new Resume<>();
        DataScientist ds = new DataScientist("Bob");
        dsResume.addResumes(ds);

        Resume<ProductManager> pmResume = new Resume<>();
        ProductManager pm = new ProductManager("Charlie");
        pmResume.addResumes(pm);

        // This will print: Software Engineer: Alice
        Utility.displayAll(seResume.getResumes());
        // This will print: Data Scientist: Bob
        Utility.displayAll(dsResume.getResumes());
        // This will print: Product Manager: Charlie
        Utility.displayAll(pmResume.getResumes());
    }
}
