package my.patterns.abstractFactory;

public class CompanyFactory extends AbstractFactory {
    private static final String googleName = "GOOGLE";
    private static final String linuxName = "LINUX";

    @Override
    public Company getCompany(String name) {
        if (name.equals(googleName)){
            return new GoogleCompany();
        } else if (name.equals(linuxName)){
            return new LinuxCompany();
        }
        return null;
    }

    @Override
    public Employee getEmployee(String type) {
        return null;
    }
}
