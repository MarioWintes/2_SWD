package aufgabenverwaltung;

public interface Task {

    int getId();
    String getDescription();
    Priority getPriority();
    Status getStatus();
    void setStatus(Status status);

    void addTask();
    void removeTask();
    void updateTaskStatus();
    void listTasks();
    void listTasksByStatus();
    void listTasksByPriority();

}
