package annotation.repetableannotation;

import java.lang.reflect.Method;

public class RepetableAnnotationExample {
    public static void main(String[] args) throws Exception {
        Class<?> cls = BugTracker.class;
        Method method = cls.getDeclaredMethod("process");

        if (method.isAnnotationPresent(BugReports.class)) {
            BugReports bugReports = method.getAnnotation(BugReports.class);
            for (BugReport bug : bugReports.value()) {
                System.out.println("Bug Description: " + bug.description());
                System.out.println("Reported By: " + bug.reportedBy());

            }
        }
    }
}
