import java.util.ArrayList;
import java.util.Scanner;

/**
 * Заполнить коллекцию 5 строками введенными с консоли.
 * В каждой строке заменить "+" на "+++".
 * Вывести коллекцию-результат на экран.
 */

public class TaskSecond {
    public static void main(String[] args) {
        ArrayList<String> newArrayList = new ArrayList<>();
        ArrayList<String> oldArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            oldArrayList.add(s);
            newArrayList.add(s.replace("+", "+++"));

        }
        System.out.println(oldArrayList);
        System.out.println(newArrayList);
    }
}
