package zjoy.research.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import zjoy.research.User;

public class Test {
	public static void main(String[] args) {
		
		
		User user = new User("周洋","男");
		User user1 = new User("周洋1","男");
		User user2 = new User("周洋2","男");
		User user3 = new User("周洋3","男");
		User user4 = new User("周洋4","男");
		User user5 = new User("周洋5","男");
		User user6 = new User("周洋6","男");
		List<User> users = new ArrayList<User>();
		users.add(user);
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		users.add(user6);
		
		User user7 = new User("周洋4","男");
		User user8 = new User("周洋4","男");
		User user9 = new User("周洋4","男");
		User user10 = new User("周洋4","男");
		List<User> users1 = new ArrayList<User>();
		users1.add(user7);
		users1.add(user8);
		users1.add(user9);
		users1.add(user10);
		List<User> users2 = new ArrayList<User>();
		users2.add(user7);
		users2.add(user8);
		users2.add(user9);
		users2.add(user10);
		
		Set<User> set = new HashSet<User>(users);
		set.addAll(users);
		
		Iterator<User> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
}
