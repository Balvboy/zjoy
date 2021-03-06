package zjoy.utils.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface Log {
	
	public String level() default "INFO";
}
