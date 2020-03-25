package my.patterns.facade;

public class TextFacade {

    public static String compress(String text){
        TextService textService = new TextService(text);
        text = EncryptionService.encrypt(textService.getText());
        return CompressionService.pseudoCompress(text);
    }
}
