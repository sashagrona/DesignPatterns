package my.patterns.abstractFactory;

public class EmployeeFactory extends AbstractFactory {
    private static final String devType = "DEV";
    private static final String qaType = "QA";

    @Override
    public Company getCompany(String name) {
        return null;
    }

    @Override
    public Employee getEmployee(String type) {
        if (type.equals(devType)){
            return new DeveloperEmployee();
        }else if (type.equals(qaType)){
            return new QAEmployee();
        }
        return null;
    }
}