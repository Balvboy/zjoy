package zjoy.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import zjoy.utils.file.FileInterface;

public class UtilFactory<T> {

	@SuppressWarnings("unchecked")
	public T getUtilInstance(Class<? extends FileInterface> class1,InvocationHandler handler) {
		T t = (T) Proxy.newProxyInstance(class1.getClassLoader(), class1.getInterfaces(), handler);
		return t;
	}

	
}
