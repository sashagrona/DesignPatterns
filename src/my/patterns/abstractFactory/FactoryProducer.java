package my.patterns.abstractFactory;

public class FactoryProducer {
    private static final String EMPLOYEE = "EMPLOYEE";
    private static final String COMPANY = "COMPANY";
    public AbstractFactory getFactory(String factoryName){
        if (factoryName.equals(EMPLOYEE)){
            return new EmployeeFactory();
        }else if (factoryName.equals(COMPANY)){
            return new CompanyFactory();
        }
        return null;
    }
}
