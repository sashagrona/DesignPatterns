package my.patterns.chainOfResponsibility;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class OAuthProcessor {
    protected OAuthProcessor nextProcessor;
    protected String user;
    protected Logger logger;

    public OAuthProcessor() {
    }

    public OAuthProcessor(OAuthProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public boolean check(String user){
        if (this.user.equals(user)){
            logger.log(Level.INFO, "{0}{1}", new Object[]{"The user comes from ", user});
            return true;
        }else if (nextProcessor != null){
            logger.log(Level.WARNING, "{0}{1},{2}{3}",new Object[]{"Can't process it on ",this.user," passing it to ",nextProcessor.user});
            return nextProcessor.check(user);
        }
        return false;
    };
}
