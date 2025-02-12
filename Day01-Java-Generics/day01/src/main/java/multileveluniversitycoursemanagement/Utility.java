package multileveluniversitycoursemanagement;

import java.util.List;

public class Utility {
    public static void displayAllcourse(List<? extends CourseType> courses){
        for(CourseType course:courses){
            course.evaluatin();
        }
    }
}
