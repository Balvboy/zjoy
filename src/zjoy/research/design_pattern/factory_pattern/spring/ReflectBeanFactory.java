package zjoy.research.design_pattern.factory_pattern.spring;

import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import zjoy.research.design_pattern.factory_pattern.simpleFactory.Animal;

public class ReflectBeanFactory implements BeanFactory {

	@Override
	public Object getBean(String beanName) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		Object object = Class.forName(beanName).getConstructor().newInstance();
		return object;
	}
	
	public static void main(String[] args) throws Exception {
		Properties pro = new Properties();
		pro.load(ReflectBeanFactory.class.getClassLoader().getResourceAsStream("zjoy/research/design_pattern/factory_pattern/spring/spring.properties"));
		Object object = Class.forName(pro.get("beanName").toString()).getConstructor().newInstance();
		Animal a = (Animal)object;
		a.run();
	}

}
