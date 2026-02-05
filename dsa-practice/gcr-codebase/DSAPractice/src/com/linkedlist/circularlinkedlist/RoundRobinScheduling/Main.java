package com.linkedlist.circularlinkedlist.RoundRobinScheduling;

import java.util.Scanner;

public class Main {
    private final Scanner input = new Scanner(System.in);
    private final SchedulerList scheduler = new SchedulerList();

    public void start() {
        System.out.println("=====================================");
        System.out.println("    CPU Round Robin Scheduler        ");
        System.out.println("=====================================");
        
        while (true) {
            System.out.println("\n1. Add Process\n2. View Queue\n3. Start Simulation\n4. Exit");
            System.out.print("Choice: ");
            int choice = input.nextInt();

            switch (choice) {
            case 1:
                System.out.print("Enter Process ID: ");
                int pid = input.nextInt();
                System.out.print("Enter Burst Time: ");
                int burst = input.nextInt();
                System.out.print("Enter Priority: ");
                int prio = input.nextInt();
                scheduler.addProcess(pid, burst, prio);
                break;
            case 2:
                scheduler.displayQueue();
                break;
            case 3:
                System.out.print("Enter Time Quantum: ");
                int quantum = input.nextInt();
                scheduler.simulateRoundRobin(quantum);
                scheduler.displayAverages();
                // Simulation clears the list, so we might want to exit or reset here
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid choice.");
            }
        }
    }

    public static void main(String[] args) {
        new Main().start();
    }
}