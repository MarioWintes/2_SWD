package aufgabenverwaltung;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> taskList;

    public TaskManager() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(Task task){
        this.taskList.add(task);
    }

    public void removeTask(int id){
        this.taskList.remove(id);
    }

    public void updateTaskStatus(int id, Status newStatus){
        for (Task task : taskList) {
            if (task.getId() == id){
                task.setStatus(newStatus);
                return;
            }
        }
    }

    public void listTasks(){
        for (Task task : taskList) {
            System.out.println(task.toString());
        }
    }

    public void listTasksByStatus(aufgabenverwaltung.Status status){
        for (Task task : taskList) {
            if (task.getStatus() == status){
                System.out.println(task);
            }
        }
    }

    public List<Task> listTasksByPriority(Priority priority){
        List<Task> prioList = new ArrayList<>();
        for (Task task : taskList) {
            if (task.getPriority() == priority){
                prioList.add(task);
            }
        }
        return prioList;
    }
    public long countListTasksByPriority(Priority priority){
        return listTasksByPriority(priority).size();
    }

    public void printStatistics(){
        System.out.println("Statistics");
    }

}
