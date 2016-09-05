package zjoy.research;

public class User {
	
	public User(String name,String sex){
		this.name = name;
		this.sex = sex;
	}

	private String name;
	
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public boolean equals(Object obj) {
		User user = (User) obj;
		if((user.getName()+user.getSex()).equals(this.name+this.sex)){
			return true;
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		String hashStr = this.name+this.sex;
		return hashStr.hashCode();
	}
	
	
	
	
}
