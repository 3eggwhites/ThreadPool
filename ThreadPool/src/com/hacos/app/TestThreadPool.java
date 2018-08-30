package com.hacos.app;

import com.hacos.task.TestTask;
import com.hacos.threadpool.ThreadPool;

public class TestThreadPool {

	public static void main(String[] args) throws InterruptedException {
		ThreadPool pool = new ThreadPool(3, 4);
		for(int i = 0; i<=7; i++) {
			TestTask task = new TestTask(i);
			pool.submitTask(task);
		}

	}

}
