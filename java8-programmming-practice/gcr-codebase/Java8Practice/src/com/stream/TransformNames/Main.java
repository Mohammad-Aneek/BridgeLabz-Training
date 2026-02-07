package com.stream.TransformNames;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
	List<String> names = Arrays.asList("alice", "bob", "charlie", "david");

	names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
