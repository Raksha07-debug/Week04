package reflection;

import org.junit.jupiter.api.Test;
import reflection.customloggingproxy.Greeting;
import reflection.customloggingproxy.GreetingImpl;
import reflection.customloggingproxy.LoggingProxy;

import static org.junit.jupiter.api.Assertions.*;

public class LoggingProxyTest {

    @Test
    public void testProxyLogging() {
        Greeting originalGreeting = new GreetingImpl();
        Greeting proxyGreeting = LoggingProxy.createProxy(originalGreeting, Greeting.class);

        String message = proxyGreeting.sayHello("Raksha");
        assertEquals("Hello, Raksha!", message);
    }
}
