package my.patterns.observer;

import java.io.File;

public class Editor {
    private EventManager eventManager;
    private File file;

    public Editor(){
        this.eventManager=new EventManager("open", "save");
    }
    public void openFile(String path){
        this.file=new File(path);
        eventManager.notify("open", file);
    }

    public void saveFile() throws Exception{
        if (this.file!=null){
            eventManager.notify("save", file);
        }else {
            throw new Exception("ERROR: Please, open a file");
        }
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public File getFile() {
        return file;
    }
}
