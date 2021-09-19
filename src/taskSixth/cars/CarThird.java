package taskSixth.cars;

public class CarThird extends Car {

    public CarThird(String mark, String model, String year, String color) {
        super(mark, model, year, color);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "ModelTree : " + mark + '-' +
                model + '-' +
                year + '-' +
                color + '-';
    }
}
