package my.patterns.facade;

import java.util.Base64;

public class EncryptionService {

    public static String encrypt(String text){
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
