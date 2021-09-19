package taskSeventh;

public class Test {
    public static void main(String[] args) {
        NewList<String> list = new NewList();
        for (int i = 0; i < 11; i++) {
            list.add("Num - " + i);
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Заполнено - " + list.getSize());
        System.out.println("Размер - " + list.getSizeArr());
        list.clear();
        System.out.println("--------------------------");
        System.out.println("Заполнено - " + list.getSize());
        System.out.println("Размер - " + list.getSizeArr());

    }
}
