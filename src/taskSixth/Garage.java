package taskSixth;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    public static void main(String[] args) {
        HashMap<Car, String> myMap = new HashMap();
        myMap.put(new CarFirst("Ford", "mustang", "1999", "black"), "2");
        myMap.put(new CarSecond("Fiat", "coup", "2008", "red"), "1");
        myMap.put(new CarThird("Bmw", "e34", "1996", "black"), "3");
        for (Map.Entry<Car, String> item : myMap.entrySet()) {
            System.out.println(item.toString());
        }

    }
}
