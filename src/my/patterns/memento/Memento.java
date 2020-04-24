package my.patterns.memento;

public class Memento {
    private String name;
    private int level;
    private String title;

    public Memento(String name, int level, String title) {
        this.name = name;
        this.level = level;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", title='" + title + '\'' +
                '}';
    }
}
