package com.collectors.WordFrequency;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
	String sentence = "java is java and java is fun";
	List<String> words = Arrays.asList(sentence.split("\\s+"));

	words.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()))
		.forEach((k, v) -> System.out.println(k + "->" + v));
    }
}
