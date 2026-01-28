package com.streams.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialTest {
	public static void main(String[] args) throws Exception {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Bob"));
		list.add(new Employee(2, "Alice"));

		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("src/com/streams/Serialization/emp.dat"))) {
			oos.writeObject(list);
		}

		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("src/com/streams/Serialization/emp.dat"))) {
			ArrayList<Employee> readList = (ArrayList<Employee>) ois.readObject();
			System.out.println(readList);
		}
	}
}
