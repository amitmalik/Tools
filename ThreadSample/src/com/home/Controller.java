package com.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Controller {

	public static void main(String args[]) {
		Vector sharedQueue = new Vector();
		int size = 4;
		Thread prodThread = new Thread(new Producer(sharedQueue, size),
				"Producer");
		Thread consThread = new Thread(new Consumer(sharedQueue, size),
				"Consumer");
		prodThread.start();
		consThread.start();
	}

}
