package my.patterns.observer;

import java.io.File;

public class EmailListener implements EventListener{
    private String email;

    public EmailListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String operation, File file) {
        System.out.println("Operation " + operation + " has been performed to " + file.getName());
        System.out.println("Send notification to " + email);
    }
}
