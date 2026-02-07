package com.stream.TopTrending;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(new Movie("Inception", 8.8, 2010),
				new Movie("The Dark Knight", 9.0, 2008),
				new Movie("Future Film", 7.5, 2024),
				new Movie("Space Odyssey", 9.2, 2025),
				new Movie("Comedy Hit", 8.0, 2024),
				new Movie("Action Blast", 6.5, 2024),
				new Movie("Drama King", 8.9, 2025));

		System.out.println("Top movies: ");
		movies.stream().filter(movie -> movie.rating >= 8 && movie.year == 2024)
				.sorted((m1, m2) -> Double.compare(m1.rating, m2.rating))
				.limit(5).forEach(System.out::println);
	}
}
