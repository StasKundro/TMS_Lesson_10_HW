/**
 * Создать неизменяемы(imnnutable) класс
 */

public final class TaskFourth {
    final String name;

    public TaskFourth(String name) {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    class Test
    {
        public static void main(String args[])
        {
            TaskFourth s = new TaskFourth("Stas");
            System.out.println(s.getName());
        }
    }
}
