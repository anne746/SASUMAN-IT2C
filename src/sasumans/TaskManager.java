package sasumans;


import java.util.Scanner;

public class TaskManager {
    public void manageTasks() {
        Scanner sc = new Scanner(System.in);
        Task[] tasksArray = new Task[100];

        System.out.print("Enter number of tasks: ");
        int numTasks = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < numTasks; i++) {
            System.out.println("Enter details for task " + (i + 1) + ":");
            System.out.print("Task ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Task Name: ");
            String taskName = sc.nextLine();
            System.out.print("Assigned To: ");
            String assignee = sc.nextLine();
            System.out.print("Due Date: ");
            String dueDate = sc.nextLine();
            System.out.print("Priority: ");
            String priority = sc.nextLine();
            System.out.print("Status: ");
            String status = sc.nextLine();

            tasksArray[i] = new Task(id, taskName, assignee, dueDate, priority, status);
        }

        System.out.printf("%-10s %-15s %-15s %-15s %-10s %-10s \n",
                "ID", "Task Name", "Assigned To", "Due Date", "Priority", "Status");

        for (int i = 0; i < numTasks; i++) {
            tasksArray[i].viewTask();
        }

        sc.close();
    }
}

