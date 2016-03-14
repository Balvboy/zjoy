package zjoy.research.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import zjoy.research.spring.aop.MyClass;

public class TestApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
		MyClass as = (MyClass)ctx.getBean("myClass");  
		as.say();
	}
}
