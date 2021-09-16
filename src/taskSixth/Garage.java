package taskSixth;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put(String.valueOf(new CarFirst("Audi", "TT", "2010", "red")), "8");
        hashmap.put(String.valueOf(new CarSecond("BMW", "E34", "1998", "black")), "5");
        hashmap.put(String.valueOf(new CarThird("Toyota", "Camry", "2018", "white")), "3");
        for (Map.Entry<String, String> item : hashmap.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue() + " моделей");
        }
        System.out.println(parking());
        System.out.println(exit());
    }

    private static boolean parking() {
        System.out.println("Парковка");
        return true;
    }

    private static boolean exit() {
        System.out.println("Выезд");
        return true;
    }
}