package multileveluniversitycoursemanagement;

public class ResearchCourse extends CourseType{
    ResearchCourse(String courseName){
        super(courseName);
    }

    @Override
    public void evaluatin() {
        System.out.println(getCourseName() + " is evaluated through assignment.");
    }
}
