package my.patterns.facade;

public class CompressionService {

    public static String pseudoCompress(String text){
        int end = (text.length()%2 !=0) ? (3*text.length()/4) + 1 : (3*text.length()/4);
        return text.substring(text.length()/4, end);
    }
}
