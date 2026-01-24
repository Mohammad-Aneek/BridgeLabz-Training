package com.dayfour.HospitalQueue;

public class HospitalQueue {
	public static void bubbleSort(Patient[] patients) {
		boolean swapped;

		for (int i = 0; i < patients.length - 1; i++) {
			swapped = false;

			for (int j = 0; j < patients.length - i - 1; j++) {

				if (patients[j].compareTo(patients[j + 1]) > 0) {
					Patient temp = patients[j];
					patients[j] = patients[j + 1];
					patients[j + 1] = temp;

					swapped = true;
				}
			}

			if (!swapped) {
				return;
			}
		}

	}
}
