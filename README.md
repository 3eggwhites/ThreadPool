# ThreadPool
POC for threadpool without executor framework to understand internal working of executor frame work and how threadpool works
I followed this tutorial http://www.makeinjava.com/custom-thread-pool-example-without-using-executor-framework/ 
to make this little project

We will implement custom thread pool using following classes.
BlockingQueue: BlockingQueue class will be used to store tasks.
TaskExecutor: TaskExecutor class is capable of executing the task.
ThreadPool: ThreadPool class is responsible for en-queuing task to blocking queue,
TestTask: The task or operation, which we want to execute.
TestThreadPool: TestThreadPool class creates the tasks and submit tasks to thread pool.
