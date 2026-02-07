package com.collectors.LibraryStatistics;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
	List<Book> library = Arrays.asList(new Book("The Alchemist", "Fantasy", 328),
		new Book("1984", "Dystopian", 268), new Book("To Kill a Mockingbird", "Fiction", 281),
		new Book("The Great Gatsby", "Fiction", 180), new Book("Brave New World", "Dystopian", 311),
		new Book("The Hobbit", "Fantasy", 310));

	library.stream().collect(Collectors.groupingBy(b -> b.genre, Collectors.summarizingInt(b -> b.pages)))
		.forEach((k, v) -> System.out.println(k + "->" + v));
    }

}
