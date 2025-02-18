package annotation.customannotation;

public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Raksha")
    public void completeProject() {
        System.out.println("Completing project");
    }

    @TaskInfo(assignedTo = "Savi")
    public void reviewCode() {
        System.out.println("Reviewing code");
    }

    public void generalTask() {
        System.out.println("This task has no annotation");
    }
}