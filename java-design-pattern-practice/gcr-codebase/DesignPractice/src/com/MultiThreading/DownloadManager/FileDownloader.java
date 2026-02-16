package com.MultiThreading.DownloadManager;

public class FileDownloader implements Runnable {
	private String fileName;

	public FileDownloader(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 100; i += 25) {
			System.out.println("[" + Thread.currentThread().getName() + "] Downloading " + fileName + ": " + i + "%");
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}