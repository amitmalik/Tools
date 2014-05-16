package com.deadlock;

public class B {

	synchronized void BMethod(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " Inside Bmehtod");

		try {

			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e + " B interrupted");
		}

		System.out.println("Call BMethod");
		a.last();
	}

	synchronized void last() {
		System.out.println("inside B last");
	}

}
