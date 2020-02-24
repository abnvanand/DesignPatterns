package structural.decorator.example1;

import structural.decorator.example1.decorators.CompressionDecorator;
import structural.decorator.example1.decorators.EncryptionDecorator;
import structural.decorator.example1.plain.DataSource;
import structural.decorator.example1.plain.FileDataSource;

public class Demo {
    public static void main(String[] args) {
        String fileName = "Dummy.txt";

        DataSource plain = new FileDataSource(fileName);
        plain.writeData("Hello");
        System.out.println(plain.readData());


        DataSource encrypt = new EncryptionDecorator(plain);
        DataSource compressEncrypt = new CompressionDecorator(encrypt);
        DataSource encryptCompressEncrypt = new EncryptionDecorator(compressEncrypt);

        encryptCompressEncrypt.writeData("Hello");
        System.out.println(encryptCompressEncrypt.readData());

    }
}
