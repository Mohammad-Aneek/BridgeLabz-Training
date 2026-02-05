package com.linkedlist.circularlinkedlist.RoundRobinScheduling;

public class SchedulerList {
    private ProcessNode head;
    private ProcessNode tail;
    private int size;
    
    // Accumulators for averages
    private double totalWaitTime = 0;
    private double totalTurnAroundTime = 0;
    private int finishedProcessCount = 0;

    public SchedulerList() {
        head = tail = null;
        size = 0;
    }

    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    // Logic to remove a node specifically when it finishes execution
    private void removeFinishedProcess(ProcessNode node) {
        if (head == null) return;

        ProcessNode curr = head;
        ProcessNode prev = tail;

        do {
            if (curr == node) {
                if (curr == head && curr == tail) {
                    head = tail = null;
                } else {
                    if (curr == head) head = head.next;
                    if (curr == tail) tail = prev;
                    prev.next = curr.next;
                }
                size--;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    public void simulateRoundRobin(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        System.out.println("\nStarting Simulation (Quantum: " + timeQuantum + ")...");
        int currentTime = 0;
        ProcessNode current = head;
        
        // Loop until all processes are finished (list becomes empty)
        while (size > 0) {
            int executionTime;
            
            // Determine how long this process runs
            if (current.getRemainingBurstTime() > timeQuantum) {
                executionTime = timeQuantum;
            } else {
                executionTime = current.getRemainingBurstTime();
            }

            // Execute
            current.reduceTime(executionTime);
            currentTime += executionTime;
            System.out.printf("Time %d: Executed P%d for %d units. ", currentTime, current.getProcessID(), executionTime);
            
            ProcessNode nextNode = current.next; // Save next before potential deletion

            if (current.isFinished()) {
                System.out.print(" -> P" + current.getProcessID() + " Completed.");
                current.calculateStats(currentTime);
                
                // Add to totals
                totalWaitTime += current.getWaitingTime();
                totalTurnAroundTime += current.getTurnAroundTime();
                finishedProcessCount++;

                current.displayStats();
                removeFinishedProcess(current);
            } else {
                System.out.print(" -> Remaining: " + current.getRemainingBurstTime());
            }
            System.out.println();
            
            // Move to next process (if list not empty)
            current = nextNode; 
            
            // If we deleted the last node, break
            if (head == null) break;
        }
        
        System.out.println("Simulation Finished.");
    }

    public void displayAverages() {
        if (finishedProcessCount == 0) {
            System.out.println("No processes have finished execution yet.");
        } else {
            System.out.println("\n--- Final Statistics ---");
            System.out.println("Total Processes: " + finishedProcessCount);
            System.out.printf("Average Waiting Time: %.2f\n", (totalWaitTime / finishedProcessCount));
            System.out.printf("Average Turn-Around Time: %.2f\n", (totalTurnAroundTime / finishedProcessCount));
        }
    }
    
    public void displayQueue() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }
        ProcessNode temp = head;
        System.out.println("Current Process Queue:");
        do {
            temp.displayStatus();
            temp = temp.next;
        } while (temp != head);
    }
}