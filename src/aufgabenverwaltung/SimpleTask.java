package aufgabenverwaltung;

public class SimpleTask implements Task{

    private static int counter = 1;
    private final int id;
    private String description;
    private Priority priority;
    private Status status;


    @Override
    public String toString() {
        return "SimpleTask{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }

    public SimpleTask(String description, Priority priority, Status status) {
        this.id = counter;
        this.description = description;
        this.priority = priority;
        this.status = status;
        counter++;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public Priority getPriority() {
        return null;
    }

    @Override
    public Status getStatus() {
        return null;
    }

    @Override
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public void addTask() {

    }

    @Override
    public void removeTask() {

    }

    @Override
    public void updateTaskStatus() {

    }

    @Override
    public void listTasks() {

    }

    @Override
    public void listTasksByStatus() {

    }

    @Override
    public void listTasksByPriority() {

    }
}
