package com.linkedlist.circularlinkedlist.TaskScheduler;

import java.util.Scanner;

public class Main {
    private final Scanner input = new Scanner(System.in);
    private final TaskList scheduler = new TaskList();

    public void start() {
        while (true) {
            System.out.println("\n--- Task Scheduler (Circular) ---");
            System.out.println("1. Add Task\n2. Remove Task\n3. View Current & Next (Simulate)\n4. Display All\n5. Search Priority\n6. Exit");
            System.out.print("Selection: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("ID: "); int id = input.nextInt();
                    System.out.print("Name: "); input.nextLine(); String name = input.nextLine();
                    System.out.print("Priority (1-High, 5-Low): "); int prio = input.nextInt();
                    System.out.print("Due Date: "); input.nextLine(); String date = input.nextLine();
                    scheduler.addTaskAtEnd(id, name, prio, date);
                }
                case 2 -> {
                    System.out.print("Enter Task ID to remove: ");
                    scheduler.removeTask(input.nextInt());
                }
                case 3 -> scheduler.runSchedulerStep();
                case 4 -> scheduler.displayAllTasks();
                case 5 -> {
                    System.out.print("Enter Priority to search: ");
                    scheduler.searchByPriority(input.nextInt());
                }
                case 6 -> {
                    System.out.println("Exiting Scheduler.");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    public static void main(String[] args) {
        new Main().start();
    }
}