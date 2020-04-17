package my.patterns.chainOfResponsibility;

import java.util.logging.Logger;

public class GithubUser extends OAuthProcessor {

    {
        user = "GITHUB";
        logger = Logger.getLogger(GithubUser.class.getName());
    }
    public GithubUser() {
    }

    public GithubUser(OAuthProcessor nextProcessor) {
        super(nextProcessor);
    }

}
