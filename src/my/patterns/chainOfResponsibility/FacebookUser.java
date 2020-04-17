package my.patterns.chainOfResponsibility;

import java.util.logging.Logger;

public class FacebookUser extends OAuthProcessor {

    {
        user = "FACEBOOK";
        logger = Logger.getLogger(FacebookUser.class.getName());
    }
    public FacebookUser() {
    }

    public FacebookUser(OAuthProcessor nextProcessor) {
        super(nextProcessor);
    }

}
