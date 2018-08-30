package com.hacos.threadpool;



public class TaskExecutor implements Runnable {
	
	BlockingQueue<Runnable> queue;
	
	public TaskExecutor(BlockingQueue<Runnable> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
		while(true) {
			String name = Thread.currentThread().getName();
			Runnable task = queue.dequeue();
			System.out.println("Task started by thread: "+name);
			task.run();
			System.out.println("Task finished by thread "+name);
		}
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}
