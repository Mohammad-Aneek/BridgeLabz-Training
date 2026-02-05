package com.linkedlist.doublylinkedlist.TextEditor;

public class EditorHistory {
    private StateNode head;
    private StateNode tail;
    private StateNode currentState; // The node currently being viewed
    private int size;
    private final int MAX_HISTORY = 10;

    public EditorHistory() {
        // Initialize with empty state
        head = tail = currentState = new StateNode(""); 
        size = 1;
    }

    // Called when user types something new
    public void addNewState(String newText) {
        StateNode newState = new StateNode(newText);
        
        // If we are adding a state, we cut off any 'redo' history available
        // The new node becomes the next of current, and becomes the new tail
        currentState.next = newState;
        newState.prev = currentState;
        currentState = newState;
        tail = newState; // New state is now the end
        
        size++;

        // Maintain fixed size history constraint
        if (size > MAX_HISTORY) {
            removeOldestState();
        }
        System.out.println("State saved.");
    }

    private void removeOldestState() {
        if (head != null && head.next != null) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (currentState.prev == null) {
            System.out.println("Cannot Undo. Reached start of history.");
        } else {
            currentState = currentState.prev;
            System.out.println("Undo successful.");
        }
    }

    public void redo() {
        if (currentState.next == null) {
            System.out.println("Cannot Redo. Reached end of history.");
        } else {
            currentState = currentState.next;
            System.out.println("Redo successful.");
        }
    }

    public void displayCurrentState() {
        System.out.println("\n-----------------------------");
        System.out.println("Current Text: " + currentState.getContent());
        System.out.println("-----------------------------");
    }
    
    // Debug method to see list structure
    public void displayHistoryList() {
        StateNode temp = head;
        System.out.print("History Trace: ");
        while(temp != null) {
            if(temp == currentState) System.out.print("[" + temp.getContent() + "] ");
            else System.out.print(temp.getContent() + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}