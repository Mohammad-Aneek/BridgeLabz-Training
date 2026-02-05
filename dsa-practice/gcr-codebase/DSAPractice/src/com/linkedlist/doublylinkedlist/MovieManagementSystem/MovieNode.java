package com.linkedlist.doublylinkedlist.MovieManagementSystem;

public class MovieNode {
    private String title;
    private String director;
    private int year;
    private double rating;
    public MovieNode next;
    public MovieNode prev;

    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }

    public boolean isTitle(String title) {
        return this.title.equalsIgnoreCase(title);
    }

    public boolean isDirector(String director) {
        return this.director.equalsIgnoreCase(director);
    }
    
    public boolean isRating(double rating) {
        return this.rating == rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void display() {
        System.out.println("Title:    " + title);
        System.out.println("Director: " + director);
        System.out.println("Year:     " + year);
        System.out.println("Rating:   " + rating + "/10");
        System.out.println();
    }
}