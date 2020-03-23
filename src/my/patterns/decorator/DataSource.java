package my.patterns.decorator;

public interface DataSource {
    void write(String data);
    String read();
}
