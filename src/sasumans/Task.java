
 
 
    package sasumans;

public class Task {
    private int id;
    private String taskName;
    private String assignee;
    private String dueDate;
    private String priority;
    private String status;

    public Task(int id, String taskName, String assignee, String dueDate, String priority, String status) {
        this.id = id;
        this.taskName = taskName;
        this.assignee = assignee;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = status;
    }

    public void viewTask() {
        System.out.printf("%-10d %-15s %-15s %-15s %-10s %-10s\n",
                this.id, this.taskName, this.assignee, this.dueDate, this.priority, this.status);
    }
}

    
    
    
    
    
    
    
    
    
    
    
    

