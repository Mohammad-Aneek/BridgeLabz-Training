package com.stream.Sensor;

import java.util.*;

public class Main {
    public static void main(String[] args) {
	List<Integer> readings = Arrays.asList(20, 80, 95, 22);
	readings.stream().filter(r -> r > 50).forEach(r -> System.out.println("ALERT: High Temp " + r));
    }
}
