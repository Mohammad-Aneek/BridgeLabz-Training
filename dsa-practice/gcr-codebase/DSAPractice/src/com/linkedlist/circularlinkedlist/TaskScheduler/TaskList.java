package com.linkedlist.circularlinkedlist.TaskScheduler;

public class TaskList {
    private TaskNode head;
    private TaskNode tail;
    private TaskNode currentTask; // Helper for scheduler simulation
    private int size;

    public TaskList() {
        head = tail = currentTask = null;
        size = 0;
    }

    // Add task at end (maintains circularity)
    public void addTaskAtEnd(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);
        if (head == null) {
            head = tail = newNode;
            tail.next = head; // Point back to self
            currentTask = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Point back to head
        }
        size++;
    }

    public void addTaskAtBeginning(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            currentTask = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // Update tail to point to new head
        }
        size++;
    }
    
    // Remove Task by ID
    public void removeTask(int id) {
        if (head == null) return;

        TaskNode curr = head;
        TaskNode prev = tail;

        // Check if head is the node to delete
        if (curr.isTaskID(id)) {
            if (head == tail) { // Only one node
                head = tail = currentTask = null;
            } else {
                head = head.next;
                tail.next = head; // Maintain circle
                if (currentTask == curr) currentTask = head;
            }
            size--;
            System.out.println("Task removed.");
            return;
        }

        // Search rest of the list
        do {
            if (curr.isTaskID(id)) {
                prev.next = curr.next;
                if (curr == tail) {
                    tail = prev;
                }
                if (currentTask == curr) currentTask = curr.next;
                size--;
                System.out.println("Task removed.");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Task ID not found.");
    }

    // Display all starting from Head
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks scheduled.");
            return;
        }
        TaskNode temp = head;
        System.out.println("All Tasks:");
        do {
            temp.display();
            temp = temp.next;
        } while (temp != head);
    }

    // Scheduler Simulation: View current and move to next
    public void runSchedulerStep() {
        if (currentTask == null) {
            System.out.println("No tasks to run.");
            return;
        }
        System.out.println("Executing Task:");
        currentTask.display();
        System.out.println("...Completed. Moving to next task...");
        currentTask = currentTask.next;
    }

    public void searchByPriority(int priority) {
        if (head == null) return;
        TaskNode temp = head;
        boolean found = false;
        do {
            if (temp.isPriority(priority)) {
                temp.display();
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No tasks with priority " + priority);
    }
}