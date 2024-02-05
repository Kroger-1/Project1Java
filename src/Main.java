import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String events[] = {"(1) Add a Task", "(2) Remove a Task", "(3) Update Task", "(4) List tasks", "(5) Quit"};
        ArrayList<String> tasks = new ArrayList<>();

        //Printing the events!
        String taskSelect = "";
        while (!(taskSelect.equals("5"))) {
            for (int i = 0; i < events.length; i++) {
                System.out.println(events[i]);
            }

            //user makes selections
            System.out.println("What do you wanna do?");
            taskSelect = input.nextLine();
            if (taskSelect.equals("1")) {
                addTasks(tasks);
            }
            if (taskSelect.equals("2")) {
                removeTasks(tasks);
            }
            if (taskSelect.equals("3")) {
                updateTasks(tasks);
            }
            if (taskSelect.equals("4")) {
                System.out.println(tasks);
            }
        }
    }

    static void addTasks(ArrayList<String> a) {
        System.out.println("Add a task...");
        String newTask = input.nextLine();
        a.add(newTask);
    }
    static void removeTasks(ArrayList<String> a) {
        System.out.println("Remove a task...");
        int removeTask = Integer.parseInt(input.nextLine());
        a.remove(removeTask);
    }
    static void updateTasks(ArrayList<String> a) {
        System.out.println("What do you want to update?");
        System.out.println(a);
        String updateTaskSelect = input.nextLine();
        System.out.println("Update a task...");
        String updateTask = input.nextLine();
        a.set(Integer.parseInt(updateTaskSelect), updateTask);
    }
}
