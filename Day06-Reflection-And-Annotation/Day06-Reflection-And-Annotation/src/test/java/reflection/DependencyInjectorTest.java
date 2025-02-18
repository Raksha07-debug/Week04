package reflection;

import org.junit.jupiter.api.Test;
import reflection.dependencyinjectionusingreflection.Consumer;
import reflection.dependencyinjectionusingreflection.DependencyInjector;
import reflection.dependencyinjectionusingreflection.ServiceA;
import reflection.dependencyinjectionusingreflection.ServiceB;

import static org.junit.jupiter.api.Assertions.*;

public class DependencyInjectorTest {

    @Test
    public void testDependencyInjection() throws Exception {
        DependencyInjector injector = new DependencyInjector();

        injector.register(ServiceA.class);
        injector.register(ServiceB.class);

        Consumer consumer = new Consumer();
        injector.injectDependencies(consumer);

        assertNotNull(consumer);
    }
}
