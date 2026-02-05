package com.linkedlist.circularlinkedlist.TaskScheduler;

public class TaskNode {
    private int taskID;
    private String taskName;
    private int priority;
    private String dueDate;
    public TaskNode next;

    public TaskNode(int taskID, String taskName, int priority, String dueDate) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }

    public boolean isTaskID(int id) {
        return this.taskID == id;
    }

    public boolean isPriority(int priority) {
        return this.priority == priority;
    }

    public void display() {
        System.out.printf("[ID: %d | Task: %s | Priority: %d | Due: %s]\n", 
            taskID, taskName, priority, dueDate);
    }
}