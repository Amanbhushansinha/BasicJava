package com.practive;

public class ThreaddConcept {
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			System.out.println("Thread is running...");
		});
		t.start();
		
		try {
			System.out.println("Thread Started......");
			t.join(5000); // Wait for the thread to finish or timeout after 5 seconds
			System.out.println("Thread Ending.......");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}