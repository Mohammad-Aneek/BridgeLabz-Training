package com.linkedlist.doublylinkedlist.TextEditor;

import java.util.Scanner;

public class Main {
    private final Scanner input = new Scanner(System.in);
    private final EditorHistory editor = new EditorHistory();

    public void start() {
        System.out.println("=====================================");
        System.out.println("    Text Editor (Undo/Redo System)   ");
        System.out.println("=====================================");
        
        // Initial Display
        editor.displayCurrentState();

        while (true) {
            System.out.println("\n1. Type (Add State)\n2. Undo\n3. Redo\n4. Show History Trace\n5. Exit");
            System.out.print("Action: ");
            int choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
            case 1:
                System.out.print("Enter new text content: ");
                String text = input.nextLine();
                editor.addNewState(text);
                editor.displayCurrentState();
                break;
            case 2:
                editor.undo();
                editor.displayCurrentState();
                break;
            case 3:
                editor.redo();
                editor.displayCurrentState();
                break;
            case 4:
                editor.displayHistoryList();
                break;
            case 5:
                System.out.println("Closing Editor.");
                return;
            default:
                System.out.println("Invalid option.");
            }
        }
    }

    public static void main(String[] args) {
        new Main().start();
    }
}