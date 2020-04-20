package my.patterns;

import my.patterns.template.Facebook;
import my.patterns.template.LinkedIn;
import my.patterns.template.SocialNetwork;

public class Main {

    public static void main(String[] args) {
        SocialNetwork linkedIn = new LinkedIn();
        linkedIn.check("sasha", "123");
        linkedIn.check("sasha", "123");
    }
}
