package junit;

public class Performance {
    public static String longRunningTask() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }    public static void main(String[] args) {
        System.out.println("Starting long-running task...");
        String result = Performance.longRunningTask();
        System.out.println("Result: " + result);
    }
}