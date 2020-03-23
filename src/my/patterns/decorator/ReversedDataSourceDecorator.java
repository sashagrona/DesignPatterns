package my.patterns.decorator;

public class ReversedDataSourceDecorator extends DataSourceDecorator {
    public ReversedDataSourceDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void write(String data) {
        super.write(data);
    }

    @Override
    public String read() {
        return new StringBuilder(super.read()).reverse().toString();
    }
}
