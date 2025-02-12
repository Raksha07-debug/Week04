package multileveluniversitycoursemanagement;

abstract public class CourseType {
    String courseName;
    CourseType(String courseName){
        this.courseName=courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    abstract public void evaluatin();
}
