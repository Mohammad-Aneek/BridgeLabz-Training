package com.linkedlist.circularlinkedlist.RoundRobinScheduling;

public class ProcessNode {
    private int processID;
    private int initialBurstTime; // Kept for calculations
    private int remainingBurstTime;
    private int priority;
    
    // Stats for final calculation
    private int completionTime;
    private int waitingTime;
    private int turnAroundTime;

    public ProcessNode next;

    public ProcessNode(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.initialBurstTime = burstTime;
        this.remainingBurstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }

    public int getProcessID() {
        return processID;
    }

    public int getRemainingBurstTime() {
        return remainingBurstTime;
    }

    public void reduceTime(int quantum) {
        this.remainingBurstTime -= quantum;
        if (this.remainingBurstTime < 0) {
            this.remainingBurstTime = 0;
        }
    }

    public boolean isFinished() {
        return remainingBurstTime == 0;
    }

    // Called when process finishes
    public void calculateStats(int currentTime) {
        this.completionTime = currentTime;
        // Assuming Arrival Time = 0 for all for simplicity
        this.turnAroundTime = completionTime; 
        this.waitingTime = turnAroundTime - initialBurstTime;
    }

    public void displayStats() {
        System.out.printf("PID: %d | Burst: %d | Wait: %d | TAT: %d\n", 
            processID, initialBurstTime, waitingTime, turnAroundTime);
    }
    
    public int getWaitingTime() { return waitingTime; }
    public int getTurnAroundTime() { return turnAroundTime; }

    public void displayStatus() {
        System.out.printf("[P%d] Remaining: %d\n", processID, remainingBurstTime);
    }
}