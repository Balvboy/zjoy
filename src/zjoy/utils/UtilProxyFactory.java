package zjoy.utils;


import org.springframework.cglib.proxy.Proxy;

import zjoy.utils.handler.DefaultInvHandler;
import zjoy.utils.stringUtil.StringUtilInterface;

public class UtilProxyFactory<T> {

//	/**
//	 * 通过Proxy对象产生代理对象，和spring的aop模式类似
//	 * @param class1
//	 * @param handler
//	 * @return
//	 */
//	@SuppressWarnings("unchecked")
//	public T getUtilInstance(Class<? extends FileInterface> class1,InvocationHandler handler) {
//		T t = (T) Proxy.newProxyInstance(class1.getClassLoader(), class1.getInterfaces(), handler);
//		return t;
//	}
	
	
	@SuppressWarnings("unchecked")
	public T getUtilInstance(Class<? extends StringUtilInterface> class1,Object obj) {
		T t = (T) Proxy.newProxyInstance(class1.getClassLoader(), class1.getInterfaces(), new DefaultInvHandler(obj));
		return t;
	}

	
}
