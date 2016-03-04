package zjoy.research.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

public class Student implements Cloneable,Serializable{

	
	private String name;
	
	private int age;
	
	private Course course;
	
	public Student(String name,int age,Course course){
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	//这样的只能处理一层
	protected Student deepClone() throws CloneNotSupportedException {
		Student student = (Student)super.clone();
		String studentName = new String(name);
		Course cou = (Course)course.clone();
		student.setName(studentName);
		student.setCourse(cou);
		return student;
	}
	
	//这样能处理所有的
	public Object realDeepClone() throws IOException, OptionalDataException, ClassNotFoundException {
		// 将对象写到流里
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(this);
		// 从流里读出来
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		return (oi.readObject());
	}
	
	
	
	
	
}
