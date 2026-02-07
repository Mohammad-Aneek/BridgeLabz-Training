package com.stream.StockPriceLogger;

import java.util.*;

public class Main {
    public static void main(String[] args) {
	List<Double> prices = Arrays.asList(150.5, 152.0, 149.8);
	prices.forEach(p -> System.out.println("Price: " + p));
    }
}
