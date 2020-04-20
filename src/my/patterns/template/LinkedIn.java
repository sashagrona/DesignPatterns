package my.patterns.template;

import java.util.List;

public class LinkedIn extends SocialNetwork {

    public LinkedIn() {
    }

    @Override
    public boolean login(String username, String password) {
        if (registered.get(username).equals(password)) {
            System.out.println("LinkedIn user " + username + " has logged in");
            return true;
        }
        return false;
    }

    @Override
    public boolean checkMail(String username) {
        if (newMails.get(username) != null && !newMails.get(username).isEmpty()) {
            System.out.println(username + " has unread mails on LinkedIn");
            return true;
        }
        return false;
    }

    @Override
    public void logout(String username) {
        System.out.println("LinkedIn user " + username + " has logged out");
    }

    @Override
    public void readMail(String username) {
        List<String> list = newMails.get(username);
        System.out.println("LinkedIn user " + username + " has read mails: \r\n" + list);
        list.clear();
        newMails.put(username, list);
    }
}

