package taskSixth;

public class CarThird extends Car {

    public CarThird(String mark, String model, String year, String color) {
        super(mark, model, year, color);
    }

    // @Override
    // public String toString() {
    //  return mark + " " + model;
    //  }
    @Override
    public String toString() {
        return model;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
