package my.patterns;

import my.patterns.chainOfResponsibility.FacebookUser;
import my.patterns.chainOfResponsibility.GithubUser;
import my.patterns.chainOfResponsibility.GoogleUser;
import my.patterns.chainOfResponsibility.OAuthProcessor;

public class Main {

    public static void main(String[] args) {
        OAuthProcessor git = new GithubUser();
        OAuthProcessor facebook = new FacebookUser(git);
        OAuthProcessor google = new GoogleUser(facebook);
        System.out.println(google.check("FACEBOOK"));
    }
}
