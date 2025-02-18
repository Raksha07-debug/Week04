package reflection.dependencyinjectionusingreflection;

public class Consumer {
    @Inject
    private ServiceA serviceA;

    @Inject
    private ServiceB serviceB;

    public void performTasks() {
        serviceA.doSomething();
        serviceB.execute();
    }
}