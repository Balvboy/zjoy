package zjoy.utils.handler;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.cglib.proxy.InvocationHandler;

import zjoy.utils.annotation.Log;
import zjoy.utils.annotation.TimeCount;

public class DefaultInvHandler implements InvocationHandler {
	
	private Object obj;
	
	public DefaultInvHandler(Object object) {
		this.obj = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.isAnnotationPresent(TimeCount.class)) {
			
		}
		if (method.isAnnotationPresent(Log.class)) {
			System.out.println("请求"+method.getName()+"方法，请求日期是"+new Date());
		}
		System.out.println(method.getAnnotations().length);
		System.out.println("请求"+method.getName()+"方法，请求日期是"+new Date());
		System.out.println(method);
		Object result = method.invoke(obj, args);
		return result;
	}

}
