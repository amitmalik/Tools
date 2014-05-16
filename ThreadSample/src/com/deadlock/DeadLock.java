package com.deadlock;

public class DeadLock implements Runnable {
	A a = new A();
	B b = new B();

	DeadLock() {
		Thread.currentThread().setName("Main Thread");
		Thread t = new Thread(this, "Racing thread");
		t.start();
		a.AMethod(b);
		System.out.println("back to main");
	}

	@Override
	public void run() {
		b.BMethod(a);

		System.out.println("inside rCING THREAD");
	}

	public static void main(String args[]) {
		new DeadLock();
		System.out.println("sdfsdf");
	}

}
