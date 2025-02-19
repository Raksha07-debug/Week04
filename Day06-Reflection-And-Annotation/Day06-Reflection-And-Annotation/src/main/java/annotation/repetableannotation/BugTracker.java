package annotation.repetableannotation;

public class BugTracker {

    @BugReport(description = "NullPointerException occurs on invalid input", reportedBy = "Raksha")
    @BugReport(description = "Performance issue when handling large data sets", reportedBy = "sd")
    public void process() {
        System.out.println("Processing data");
    }
}