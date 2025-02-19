package annotation.loggingmethodexecution;

import annotation.customannotation.TaskManager;

public class ExecutionTimeTest {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        PerformanceLogger.logExecutionTime(taskManager, "heavyTask");
        PerformanceLogger.logExecutionTime(taskManager, "lightweightTask");
        PerformanceLogger.logExecutionTime(taskManager, "normalTask");
    }
}
