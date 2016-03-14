package zjoy.utils.threadUtil;

import java.util.HashMap;

public class TreadLocalTest {

	static ThreadLocal<HashMap<Integer, Integer>> map0 = new ThreadLocal<HashMap<Integer, Integer>>() {
		@Override
		protected HashMap<Integer, Integer> initialValue() {
			System.out.println(Thread.currentThread().getName() + "initialValue");
			return new HashMap<Integer, Integer>();
		}
	};

	public void run() {
		Thread[] runs = new Thread[3];
		for (int i = 0; i < runs.length; i++) {
			runs[i] = new Thread(new T1(i));
		}
		for (int i = 0; i < runs.length; i++) {
			runs[i].start();
		}
	}

	public static class T1 implements Runnable {
		int id;

		public T1(int id0) {
			id = id0;
		}

		public void run() {
			System.out.println(Thread.currentThread().getName() + ":start");
			
			//当调用get方法的时候，如果没有值，会执行上面自定义的initialValue，如果重写了set方法 就会使用set方法代替
			HashMap<Integer, Integer> map = map0.get();
			for (int i = 0; i < 10; i++) {
				map.put(i, i + id * 100);
				try {
					Thread.sleep(100);
				} catch (Exception ex) {
				}
			}
			System.out.println(Thread.currentThread().getName() + ':' + map);
		}
	}

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TreadLocalTest test = new TreadLocalTest();
		test.run();
	}

}