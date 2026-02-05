package com.linkedlist.doublylinkedlist.MovieManagementSystem;

import java.util.Scanner;

public class Main {
    private final Scanner input = new Scanner(System.in);
    private final MovieList movieList = new MovieList();

    public void insert() {
        System.out.println("\n--- Add Movie ---");
        System.out.println("1. Start\n2. End\n3. Position");
        int choice = input.nextInt();
        input.nextLine(); 

        System.out.print("Title: ");
        String title = input.nextLine();
        System.out.print("Director: ");
        String director = input.nextLine();
        System.out.print("Year: ");
        int year = input.nextInt();
        System.out.print("Rating: ");
        double rating = input.nextDouble();

        switch (choice) {
            case 1 -> movieList.addMovieAtBeginning(title, director, year, rating);
            case 2 -> movieList.addMovieAtEnd(title, director, year, rating);
            case 3 -> {
                System.out.print("Position: ");
                movieList.addMovieAtPosition(title, director, year, rating, input.nextInt());
            }
        }
    }

    public void start() {
        while (true) {
            System.out.println("\n--- Movie Management System ---");
            System.out.println("1. Add Movie\n2. Remove Movie\n3. Search (Director/Rating)\n4. Display Forward\n5. Display Reverse\n6. Update Rating\n7. Exit");
            System.out.print("Choice: ");
            int choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1 -> insert();
                case 2 -> {
                    System.out.print("Enter Title to remove: ");
                    movieList.removeMovie(input.nextLine());
                }
                case 3 -> {
                    System.out.print("Enter Director Name or Rating: ");
                    movieList.searchMovie(input.nextLine());
                }
                case 4 -> movieList.displayForward();
                case 5 -> movieList.displayReverse();
                case 6 -> {
                    System.out.print("Enter Title: ");
                    String title = input.nextLine();
                    System.out.print("New Rating: ");
                    movieList.updateRating(title, input.nextDouble());
                }
                case 7 -> { return; }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    public static void main(String[] args) {
        new Main().start();
    }
}