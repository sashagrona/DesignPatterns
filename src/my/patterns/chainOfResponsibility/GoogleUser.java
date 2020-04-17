package my.patterns.chainOfResponsibility;

import java.util.logging.Logger;

public class GoogleUser extends OAuthProcessor {

    {
        user = "GOOGLE";
        logger = Logger.getLogger(GoogleUser.class.getName());
    }
    public GoogleUser() {
    }

    public GoogleUser(OAuthProcessor nextProcessor) {
        super(nextProcessor);
    }

}
