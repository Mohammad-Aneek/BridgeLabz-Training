package com.linkedlist.doublylinkedlist.MovieManagementSystem;

public class MovieList {
    private MovieNode head;
    private MovieNode tail;
    private int size;

    public MovieList() {
        head = tail = null;
        size = 0;
    }

    // Add movie at beginning
    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode; // Link back
            head = newNode;
        }
        size++;
    }

    // Add movie at end
    public void addMovieAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail; // Link back
            tail = newNode;
        }
        size++;
    }

    // Add at specific position
    public void addMovieAtPosition(String title, String director, int year, double rating, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 0) {
            addMovieAtBeginning(title, director, year, rating);
        } else if (position == size) {
            addMovieAtEnd(title, director, year, rating);
        } else {
            MovieNode temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            MovieNode newNode = new MovieNode(title, director, year, rating);
            
            // Adjust pointers
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
            size++;
        }
    }

    // Remove movie by Title
    public void removeMovie(String title) {
        if (head == null) return;

        MovieNode temp = head;
        while (temp != null && !temp.isTitle(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found.");
            return;
        }

        // Logic to remove node and update next/prev
        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        size--;
        System.out.println("Movie deleted successfully.");
    }

    // Search by Director or Rating
    public void searchMovie(String query) {
        MovieNode temp = head;
        boolean found = false;
        System.out.println("Search Results:");
        while (temp != null) {
            // Check if input matches director or parse double for rating
            boolean match = temp.isDirector(query);
            try {
                if (!match) match = temp.isRating(Double.parseDouble(query));
            } catch (NumberFormatException ignored) {}

            if (match) {
                temp.display();
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No records found.");
    }

    // Update Rating
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null && !temp.isTitle(title)) {
            temp = temp.next;
        }
        if (temp != null) {
            temp.setRating(newRating);
            System.out.println("Rating updated.");
        } else {
            System.out.println("Movie not found.");
        }
    }

    // Display Forward
    public void displayForward() {
        MovieNode temp = head;
        System.out.println("Movies (Forward):");
        while (temp != null) {
            temp.display();
            temp = temp.next;
        }
    }

    // Display Reverse (Using Tail and Prev)
    public void displayReverse() {
        MovieNode temp = tail;
        System.out.println("Movies (Reverse):");
        while (temp != null) {
            temp.display();
            temp = temp.prev;
        }
    }
}