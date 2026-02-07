package com.functionalinterface.CloningPrototype;

public class CloneTest {
	public static void main(String[] args) {
		try {
			RobotPrototype bot1 = new RobotPrototype("1");
			RobotPrototype bot2 = (RobotPrototype) bot1.clone();

			System.out.println("Bot 1 Model: " + bot1.model);
			System.out.println("Bot 2 Model: " + bot2.model);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
