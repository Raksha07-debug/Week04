package junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

class PerformanceTesting {

    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS)
    void testLongRunningTask() {
        assertEquals("Task Completed", Performance.longRunningTask());
    }
}