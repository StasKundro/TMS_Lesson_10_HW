package taskSeventh;

public class Test {
    public static void main(String[] args) {
        NewList<String> list = new NewList();
        for (int i = 0; i < 11; i++) {
            list.add("Num - " + i);
        }
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Заполнено - " + list.getSize());
        System.out.println("Размер - " + list.getSizeArr());
        list.clear();
        System.out.println("--------------------------");
        System.out.println("Заполнено - " + list.getSize());
        System.out.println("Размер - " + list.getSizeArr());
        System.out.println("--------------------------");
        list.add("hello");
        list.add(", ");
        list.add("man");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println("\n--------------------------");
        list.remove(1);
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i));
        }
    }
}
