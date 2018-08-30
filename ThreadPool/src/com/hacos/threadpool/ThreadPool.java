package com.hacos.threadpool;



public class ThreadPool {
	BlockingQueue<Runnable> queue;
	public ThreadPool(int queueSize, int nThread) {
		queue = new BlockingQueue<>(queueSize);
		String threadName = null;
		TaskExecutor task = null;
		for(int i = 0; i<nThread; i++) {
			threadName = "Thread - "+i;
			task = new TaskExecutor(queue);
			Thread thread = new Thread(task,threadName);
			thread.start();
		}
	}
	
	public void submitTask(Runnable task) throws InterruptedException{
		queue.enqueue(task);
	}

}
