package com.lamdaexpressions.SmartHome;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<String, LightAction> lightActions = new HashMap<>();
		lightActions.put("motion", (room) -> System.out.println("Motion Trigger: Lights turned on in " + room));
		lightActions.put("time", (room) -> System.out.println("Time Trigger: Lights turned on in " + room));
		lightActions.put("voice", (room) -> System.out.println("Voice Trigger: Lights turned on in " + room));

		lightActions.get("motion").activate("Living Room");
		lightActions.get("time").activate("Bedroom");
		lightActions.get("voice").activate("Kitchen");
	}
}
