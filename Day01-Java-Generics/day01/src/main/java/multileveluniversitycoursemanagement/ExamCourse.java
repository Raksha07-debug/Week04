package multileveluniversitycoursemanagement;

public class ExamCourse  extends CourseType{
    ExamCourse(String courseName){
        super(courseName);
    }

    @Override
    public void evaluatin() {
        System.out.println(getCourseName() + " is evaluated through assignment.");

    }

}
