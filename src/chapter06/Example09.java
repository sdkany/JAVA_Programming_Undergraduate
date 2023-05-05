package chapter06;
import java.util.HashSet;
class User {
	String userName;
	String email;
	User(String userName, String email){
		this.email = email;
		this.userName = userName;
	}
	@Override
	public String toString() {
		return userName + ":" + email;
	}
}
public class Example09 extends  Object{
	public static void main(String[] args) {
		HashSet set = new HashSet();     // 创建HashSet集合
		set.add(new User("Jack", "1@qq.com"));
		set.add(new User("Alice", "2@163.com"));
		set.add(new User("Jack", "1@qq.com"));
		// 输出Set集合中的元素
		System.out.println(set);
	}
}
