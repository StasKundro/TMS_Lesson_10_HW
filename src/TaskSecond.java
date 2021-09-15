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
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String[] words = s.split("");
            String r = "";
            for (int z = 0; z< words.length; z++) {
                if(words[z].equals("+")) {
                    words[z] += "++";
                }
                r += words[z];
            }
            newArrayList.add(r);
        }
        System.out.println(newArrayList);
    }
}
