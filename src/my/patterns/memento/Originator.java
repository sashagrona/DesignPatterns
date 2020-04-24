package my.patterns.memento;

public class Originator {
    private String name;
    private int level;
    private String title;

    public Originator(String name, int level, String title) {
        this.name = name;
        this.level = level;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public Memento saveToMemento(){
        return new Memento(name, level, title);
    }
    public void undoToMemento(Memento memento){
        this.name = memento.getName();
        this.level = memento.getLevel();
        this.title = memento.getTitle();
    }
}
