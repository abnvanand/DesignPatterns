package structural.decorator.example1.decorators;

import structural.decorator.example1.plain.DataSource;

import java.util.Base64;

public class EncryptionDecorator extends BaseDecorator {
    public EncryptionDecorator(DataSource objectToWrap) {
        super(objectToWrap);
    }

    @Override
    public void writeData(String data) {
        String encryptedData = encrypt(data);
        super.writeData(encryptedData);
    }

    @Override
    public String readData() {
        String encryptedData = super.readData();

        return decrypt(encryptedData);
    }

    private String encrypt(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decrypt(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}
