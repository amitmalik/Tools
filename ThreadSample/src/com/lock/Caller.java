package com.lock;

public class Caller implements Runnable {
	String msg;
	CallMe target;
	Thread t;

	public Caller(String msg, CallMe target) {
		super();
		this.msg = msg;
		this.target = target;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		target.callMe(msg);

	}

}
