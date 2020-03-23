package my.patterns.decorator;

import java.util.Base64;

public class EncryptedDataSourceDecorator extends DataSourceDecorator {

    public EncryptedDataSourceDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void write(String data) {
        data = Base64.getMimeEncoder().encodeToString(data.getBytes());
        super.write(data);
    }

    @Override
    public String read() {
        return new String(Base64.getDecoder().decode(super.read()));
    }
}
