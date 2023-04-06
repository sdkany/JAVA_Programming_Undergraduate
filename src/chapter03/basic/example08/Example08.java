package chapter03.basic.example08;
class Person {
	// 类的构造方法
	public Person() {
		System.out.println("调用了无参的构造方法");
	}
}
public class Example08 {
	public static void main(String[] args) {
		Person p = new Person();  // 实例化Person 对象
	}
}

