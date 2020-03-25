package my.patterns.facade;

public class TextService {
    private String text;

    public TextService(String text) {
        this.text = text;
    }

    public String getText() {
        return text + " was modified";
    }

}
