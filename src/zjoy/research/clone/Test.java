package zjoy.research.clone;

import java.io.IOException;
import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException, OptionalDataException, ClassNotFoundException, IOException {
		
		List<String> list = Arrays.asList("zhou","123","3123213");
		
		Course course = new Course("Java",50L,"学习",list);
		
		Student stu = new Student("周扬",25,course);
		
		//浅复制
		//这样没有做处理的clone方法实现的是 浅复制，对于引用属性，只会把引用复制到新的实例中
		Student stu2 = (Student)stu.clone();
		System.out.println("浅复制");
		//判断name是否相等
		System.out.println("引用类型name:"+(stu.getName()==stu2.getName()));
		//判断对象内的引用属性是否相等
		System.out.println("引用类型course:"+(stu.getCourse()==stu2.getCourse()));
		
		System.out.println("引用类型内的属性:"+(stu.getCourse().getCourseName()==stu2.getCourse().getCourseName()));
		
		
		
		//一层深复制
		System.out.println("一层深复制");
		Student stu3 = stu.deepClone();
		//判断name是否相等
		System.out.println("引用类型name:"+(stu.getName()==stu3.getName()));
		
		//判断对象内的引用属性是否相等
		System.out.println("引用类型course:"+(stu.getCourse()==stu3.getCourse()));
		
		System.out.println("引用类型内的属性:"+(stu.getCourse().getCourseName()==stu3.getCourse().getCourseName()));
		
		
		System.out.println("多层深复制");
		//多层深复制
		Student stu4 = (Student) stu.realDeepClone();
		
		//判断name是否相等
		System.out.println("引用类型name:"+(stu.getName()==stu4.getName()));
		
		//判断对象内的引用属性是否相等
		System.out.println("引用类型course:"+(stu.getCourse()==stu4.getCourse()));
		
		System.out.println("引用类型内的属性:"+(stu.getCourse().getCourseName()==stu4.getCourse().getCourseName()));
		
		
		
		
	}
}
