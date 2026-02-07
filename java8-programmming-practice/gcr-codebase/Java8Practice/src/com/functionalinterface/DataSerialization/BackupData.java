package com.functionalinterface.DataSerialization;

import java.io.Serializable;

public class BackupData implements Serializable {
	String filename;
	int size;

	BackupData(String filename, int size) {
		this.filename = filename;
		this.size = size;
	}
}
