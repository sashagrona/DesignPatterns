package my.patterns;

import my.patterns.iterator.BreadthFirstSearchIterator;
import my.patterns.iterator.DepthFirstSearchIterator;
import my.patterns.iterator.Graph;
import my.patterns.iterator.GraphIterator;
import my.patterns.observer.Editor;
import my.patterns.observer.EmailListener;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        EmailListener user =  new EmailListener("sasha_grona@bigmir.net");
        editor.getEventManager().subscribe("open", user);
//        editor.getEventManager().unsubscribe("open", user);

        editor.openFile("test.txt");
        try {
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
