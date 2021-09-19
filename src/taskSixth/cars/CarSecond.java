package taskSixth.cars;

public class CarSecond extends Car {

    public CarSecond(String mark, String model, String year, String color) {
        super(mark, model, year, color);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "ModelTwo : " + mark + '-' +
                model + '-' +
                year + '-' +
                color + '-';
    }
}
