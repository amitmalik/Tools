package com.lock;

public class Synch {

	public static void main(String ad[]) {
		CallMe target = new CallMe();
		Caller obj1 = new Caller("Hello", target);
		Caller obj2 = new Caller("Synchronized", target);
		Caller obj3 = new Caller("World", target);

		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
