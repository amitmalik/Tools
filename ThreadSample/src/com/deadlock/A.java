package com.deadlock;

public class A {
	synchronized void AMethod(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " Inside Amehtod");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e + " A interrupted");
		}

		System.out.println("Call AMethod");
		b.last();
	}

	void last() {
		System.out.println("inside A last");
	}
}
