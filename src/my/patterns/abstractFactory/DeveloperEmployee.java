package my.patterns.abstractFactory;

public class DeveloperEmployee implements Employee {
    @Override
    public void logTypeOfEmployee() {
        System.out.println("I am Developer employee");
    }
}
