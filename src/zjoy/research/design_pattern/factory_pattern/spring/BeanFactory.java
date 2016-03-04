package zjoy.research.design_pattern.factory_pattern.spring;

import java.lang.reflect.InvocationTargetException;

public interface BeanFactory {

	Object getBean(String beanName) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException;
	
}
