package com.hacos.task;

public class TestTask implements Runnable {
	
	private int number = 0;
	
	public TestTask(int num) {
		number = num;
	}

	@Override
	public void run() {
		System.out.println("Start executing of task number "+number);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Finished executing task number "+number);
	}

}
