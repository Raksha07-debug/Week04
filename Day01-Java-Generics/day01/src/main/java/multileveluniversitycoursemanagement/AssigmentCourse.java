package multileveluniversitycoursemanagement;

public class AssigmentCourse  extends  CourseType{
     AssigmentCourse(String courseName){
         super(courseName);
     }

    @Override
    public void evaluatin() {
        System.out.println(getCourseName() + " is evaluated through assignment.");
     }

}
