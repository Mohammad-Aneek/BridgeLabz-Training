package com.daysix.MediStore;

import java.time.LocalDate;

public interface ISellable {
	double sell(int quantity);

	boolean checkExpiry(LocalDate date);
}
