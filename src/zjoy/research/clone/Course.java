package zjoy.research.clone;

import java.io.Serializable;
import java.util.List;

public class Course implements Cloneable,Serializable {

	private String courseName;
	
	private Long courseTime;
	
	private String desc;
	
	private List<String> list;
	
	public Course(String name,Long time){
		this.courseName = name;
		this.courseTime = time;
	}
	
	public Course(String name,Long time,String desc,List<String> list){
		this.courseName = name;
		this.courseTime = time;
		this.desc = desc;
		this.list = list;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Long getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(Long courseTime) {
		this.courseTime = courseTime;
	}

	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	
	
}
