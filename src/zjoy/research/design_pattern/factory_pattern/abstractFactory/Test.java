package zjoy.research.design_pattern.factory_pattern.abstractFactory;

public class Test {

	public static void main(String[] args) {
		
		Person person = new Person(new SuperManStyle());
		person.myStyle();
		
	}
}
