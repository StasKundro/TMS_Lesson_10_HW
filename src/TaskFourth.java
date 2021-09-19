/**
 * Создать неизменяемы(imnnutable) класс
 */

public class TaskFourth {
    final String name;

    private TaskFourth(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }
}
