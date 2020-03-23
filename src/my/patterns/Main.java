package my.patterns;

import my.patterns.decorator.*;

public class Main {

    public static void main(String[] args) {
        DataSource dbsource = new DBDataSource();
        DataSource fileSource = new FileDataSource();
        DataSource encryptDecorator = new EncryptedDataSourceDecorator(dbsource);
        DataSource reversedEncryptedDecorator = new ReversedDataSourceDecorator(encryptDecorator);
        encryptDecorator.write("DB_DATA");
        System.out.println(encryptDecorator.read());
        System.out.println(reversedEncryptedDecorator.read());

    }
}
