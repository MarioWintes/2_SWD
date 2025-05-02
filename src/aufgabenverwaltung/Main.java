package aufgabenverwaltung;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        TaskManager tm = new TaskManager();

        tm.addTask(new SimpleTask("Steuern hinterziehen", Priority.HIGH, Status.IN_PROGRESS));
        tm.addTask(new SimpleTask("Staat verachten", Priority.HIGH, Status.IN_PROGRESS));

        tm.listTasks();

        List<Task> list = tm.listTasksByPriority(Priority.HIGH);
        System.out.println(list.toString());
    }
}
