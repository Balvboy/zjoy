package zjoy.utils.dateTimeUtil;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;

public class MyDateTime {

	// 锁对象
	private static final Object lockObj = new Object();
	// 存放不同模版的map
	private static Map<String, ThreadLocal<SimpleDateFormat>> sfMap = new HashMap<String, ThreadLocal<SimpleDateFormat>>();

	private static SimpleDateFormat getSimpleDateFormat(final String pattern) {
		ThreadLocal<SimpleDateFormat> tl = sfMap.get(pattern);
		if (tl == null) {
			synchronized (lockObj) {
				tl = sfMap.get(pattern);
				if (tl == null) {
					// 只有Map中还没有这个pattern的sdf才会生成新的sdf并放入map
					// 这里是关键,使用ThreadLocal<SimpleDateFormat>替代原来直接new
					// SimpleDateFormat
					tl = new ThreadLocal<SimpleDateFormat>() {
						@Override
						protected SimpleDateFormat initialValue() {
							return new SimpleDateFormat(pattern);
						}
					};
					sfMap.put(pattern, tl);
				}
			}
		}
		return tl.get();
	}

	public static void main(String[] args) {

		DateTime date = new DateTime();

		// System.out.println(date.toString("E MM/dd/yyyy HH:mm:ss"));
		System.out.println(date.toString("yyyy-MM-dd HH:mm:ss"));

	}
}
