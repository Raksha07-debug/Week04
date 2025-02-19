package annotation.createatodoannotation;

public class ProjectTasks {
    @Todo(task = "Implement user authentication", assignedTo = "Raksha", priority = "HIGH")
    public void implementAuth() {
        System.out.println("Authentication module...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Savi")
    public void optimizeDatabase() {
        System.out.println("Optimizing queries...");
    }

    @Todo(task = "Add payment gateway integration", assignedTo = "Ashi", priority = "HIGH")
    public void integratePayment() {
        System.out.println("Integrating payment gateway...");
    }

    public void completedFeature() {
        System.out.println("This feature is completed.");
    }
}
