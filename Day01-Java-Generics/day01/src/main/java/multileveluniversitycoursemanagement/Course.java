package multileveluniversitycoursemanagement;

import java.util.ArrayList;
import java.util.List;

public class Course <T extends CourseType>{
    List<T> courses;
    public  Course(){
        courses=new ArrayList<>();
    }
    public void addCourse(T course){

        courses.add(course);
    }
    public List<T> getCourses() {
        return courses;
    }
}
