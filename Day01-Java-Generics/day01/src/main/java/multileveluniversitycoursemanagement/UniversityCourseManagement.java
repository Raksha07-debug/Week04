package multileveluniversitycoursemanagement;

public class UniversityCourseManagement {
    public static void main(String[] args) {

        // Creating instances of specific courses
        ExamCourse maths = new ExamCourse("Maths");
        AssigmentCourse physics = new AssigmentCourse("Physics");
        ResearchCourse computerScience = new ResearchCourse("Computer Science Research");

        // Creating storage for each type of course
        Course<ExamCourse> examCourse = new Course<>();
        Course<AssigmentCourse> assignmentCourse = new Course<>();
        Course<ResearchCourse> researchCourse = new Course<>();

        // Adding courses to their respective storage
        examCourse.addCourse(maths);
        assignmentCourse.addCourse(physics);
        researchCourse.addCourse(computerScience);

        // Displaying all courses in each storage
        Utility.displayAllcourse(examCourse.getCourses());
        Utility.displayAllcourse(assignmentCourse.getCourses());
        Utility.displayAllcourse(researchCourse.getCourses());
    }
}
