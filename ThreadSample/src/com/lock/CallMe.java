package com.lock;

public class CallMe {

	public synchronized void callMe(String msg) {
		System.out.print("[" + msg);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Error" + e);
		}
		System.out.println("]");
	}

}
