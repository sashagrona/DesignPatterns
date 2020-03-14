package my.patterns.abstractFactory;

public abstract class AbstractFactory {
    public abstract Company getCompany(String name);
    public abstract Employee getEmployee(String type);
}
