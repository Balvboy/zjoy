package zjoy.research.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadWithCallable {

	static Object a;

	static {

		System.out.println("static");
	}

	{
		System.out.println("hello");
		a = new Object();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ThreadPoolExecutor pool = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		//
		Future<Integer> future = pool.submit(new Callable<Integer>() {
			//
			@Override
			public Integer call() throws Exception {
				Thread.sleep(2000);
				System.out.println("打印1");
				return 1;
			}

		});
		Future<Integer> future1 = pool.submit(new Callable<Integer>() {
			//
			@Override
			public Integer call() throws Exception {
				Thread.sleep(2000);
				System.out.println("打印2");
				return 2;
			}
			
		});
		Future<Integer> future2 = pool.submit(new Callable<Integer>() {
			//
			@Override
			public Integer call() throws Exception {
				Thread.sleep(2000);
				System.out.println("打印3");
				return 3;
			}
			
		});
		// future.cancel(false);
		// if(!future.isCancelled()){
		System.out.println(future.get());
		System.out.println(future1.get());
		System.out.println(future2.get());
		// }
		pool.shutdown();

//		Thread thread = new Thread();
	}

}
