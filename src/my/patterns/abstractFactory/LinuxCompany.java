package my.patterns.abstractFactory;

public class LinuxCompany implements Company {
    @Override
    public void logName() {
        System.out.println("Hey! I'm Linux company");
    }
}
