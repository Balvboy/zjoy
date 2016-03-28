package zjoy.research.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

	public static void main(String[] args) {

		/**
		 *  5个是初始线程数，10个是最大线程数，5是等待队列的大小，当前5个任务进来的时候，会先使用初始线程，
		 *  
		 *  第6个任务进来，会加入到等待队列，知道队列满了
		 *  
		 *  第10个任务进来，因为队列已经满了，所以会继续创建线程，知道达到10个的最大线程数
		 *  
		 *  第16个任务进来，因为队列已经满了，而且线程池也达到了最大线程数，所以会根据创建线程池的时候指定的handler 进行处理，如果
		 *  
		 *  没有指定handler，则会使用默认的handler，进行抛出异常处理
		 *  
		 *  当任务执行完之后，会根据指定的keepAlive，对空闲的线程进行销毁，直到线程数达到了5个的初始线程数
		 *  
		 *  如果设定了executor.allowCoreThreadTimeOut(true),会对所有空闲的线程进行销毁，直到线程数为0！
		 */
		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
				new ArrayBlockingQueue<Runnable>(5));

		for (int i = 0; i < 20; i++) {
			MyTask myTask = new MyTask(i);
			executor.execute(myTask);
			System.out.println("线程池中线程数目：" + executor.getPoolSize() + "，队列中等待执行的任务数目：" + executor.getQueue().size()
					+ "，已执行玩别的任务数目：" + executor.getCompletedTaskCount());
		}
		executor.shutdown();

	}
}

class MyTask implements Runnable {

	private int taskNum;

	public MyTask(int i) {
		this.taskNum = i;
	}

	@Override
	public void run() {
		//System.out.println("正在执行task " + taskNum);
		try {
			Thread.currentThread().sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("task " + taskNum + "执行完毕");
	}
}
