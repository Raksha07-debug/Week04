package multileveluniversitycoursemanagement;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniversityCourseManagementTest {
    @Test
    void testResesarchCourse(){
        ResearchCourse computerScience = new ResearchCourse("Computer Science Research");
        assertEquals("Computer Science Research", computerScience.getCourseName());
        computerScience.evaluatin();
    }
    @Test
    void testAssgimentCourse(){
        AssigmentCourse physics= new AssigmentCourse("physics");
        assertEquals("physics",physics.getCourseName());
        physics.evaluatin();

    }
    @Test
    void testExamCourse(){
        ExamCourse maths= new ExamCourse("Maths");
        assertEquals("Maths",maths.getCourseName());
        maths.evaluatin();
    }
    @Test
    void testCourse(){
        Course<ExamCourse> examCourse = new Course<>();
        ExamCourse maths = new ExamCourse("Maths");
        examCourse.addCourse(maths);
        List<ExamCourse> courses = examCourse.getCourses();
        assertEquals(1, courses.size());
        assertEquals(maths, courses.get(0));

    }
    @Test
    void testUtility() {
        Course<ExamCourse> examCourse = new Course<>();
        ExamCourse maths = new ExamCourse("Maths");
        examCourse.addCourse(maths);

        Course<AssigmentCourse> assignmentCourse = new Course<>();
        AssigmentCourse english = new AssigmentCourse("English");
        assignmentCourse.addCourse(english);

        Course<ResearchCourse> researchCourse = new Course<>();
        ResearchCourse computerScience = new ResearchCourse("Computer Science Research");
        researchCourse.addCourse(computerScience);

        Utility.displayAllcourse(examCourse.getCourses());
        Utility.displayAllcourse(assignmentCourse.getCourses());
        Utility.displayAllcourse(researchCourse.getCourses());
    }
}
