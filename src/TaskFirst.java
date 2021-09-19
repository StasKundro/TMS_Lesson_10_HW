import java.util.ArrayList;

/**
 * Заполнить коллекцию 10 рандомными целыми числами в промежутке от 2 до 98.
 * Найти два максимальных элемента и вывести их на экран.
 */

public class TaskFirst {
    public static void main(String[] args) {
        int a = 2;
        int b = 98;
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            num.add(a + (int) (Math.random() * b));
        }
        System.out.println(num);
    }
}
