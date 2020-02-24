package structural.decorator.example1.decorators;

import structural.decorator.example1.plain.DataSource;

public class BaseDecorator implements DataSource {
    private DataSource objectToWrap;

    public BaseDecorator(DataSource objectToWrap) {
        this.objectToWrap = objectToWrap;
    }

    @Override
    public void writeData(String data) {
        objectToWrap.writeData(data);
    }

    @Override
    public String readData() {
        return objectToWrap.readData();
    }
}
