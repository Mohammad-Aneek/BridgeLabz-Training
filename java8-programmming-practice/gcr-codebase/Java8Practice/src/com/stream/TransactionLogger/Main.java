package com.stream.TransactionLogger;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {

	List<String> txns = Arrays.asList("100", "101");
	txns.forEach(id -> System.out.println(LocalDateTime.now() + " - Processing: " + id));
    }
}
