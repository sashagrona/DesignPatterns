package my.patterns.decorator;

public class DBDataSource implements DataSource {
    private String data;

    public DBDataSource() {
    }

    @Override
    public void write(String data) {
        this.data=data;
        System.out.println("Data: " + data + " was inserted to DataBase");
    }

    @Override
    public String read() {
        return data;
    }
}
