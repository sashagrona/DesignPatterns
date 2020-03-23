package my.patterns.decorator;

public class DataSourceDecorator implements DataSource {
    protected DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void write(String data) {
        dataSource.write(data);
    }

    @Override
    public String read() {
        return dataSource.read();
    }
}
