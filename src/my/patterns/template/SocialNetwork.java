package my.patterns.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class SocialNetwork {
    protected Map<String, String> registered = new HashMap<>();
    protected Map<String, List<String>> newMails = new HashMap<>();

    {
        //same user is registered in  descendant classes networks
        registered.put("sasha", "123");
        registered.put("blabla" , "321");
        List<String> list = new ArrayList<>();
        list.add("New Mail");
        newMails.put("sasha", list);
    }
    public SocialNetwork() {
    }

    public void check(String username, String password){
        if (login(username, password)){
            if (checkMail(username)){
                readMail(username);
            }else {
                System.out.println("No new mails for " + username);
            }
            logout(username);
        }else {
            System.out.println("Invalid username or password. Can't login " + username);
        }
    }

    public abstract boolean login(String username, String password);

    public abstract boolean checkMail(String username);

    public abstract void logout(String username);

    public abstract void readMail(String username);
}
