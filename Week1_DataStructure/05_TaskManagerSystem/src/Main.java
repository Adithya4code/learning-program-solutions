public class Main {
    public static void main(String[] args) {
        TaskManager taskList = new TaskManager();

        taskList.addTask(new Task(1, "Design module", "Pending"));
        taskList.addTask(new Task(2, "Write tests", "In Progress"));
        taskList.addTask(new Task(3, "Review code", "Completed"));

        System.out.println("\nAll Tasks:");
        taskList.displayTasks();

        System.out.println("\nSearching for Task ID 2:");
        Task t = taskList.searchTask(2);
        System.out.println(t != null ? t : "Task not found");

        System.out.println("\nDeleting Task ID 2:");
        boolean deleted = taskList.deleteTask(2);
        System.out.println(deleted ? "Task deleted." : "Task not found.");

        System.out.println("\nAll Tasks after deletion:");
        taskList.displayTasks();
    }
}
