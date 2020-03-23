package my.patterns.decorator;

public class FileDataSource implements DataSource {
    private String data;

    public FileDataSource() {
    }

    @Override
    public void write(String data) {
        this.data=data;
        System.out.println("Data: " + data + " was written to the file");
    }

    @Override
    public String read() {
        return data;
    }
}
