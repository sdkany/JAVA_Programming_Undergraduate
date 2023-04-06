package chapter03.basic.example11;
class Person {
	public Person() {
		System.out.println("无参的构造方法被调用了...");
	}
	public Person(int age) {
		this();                    // 调用无参的构造方法
		System.out.println("有参的构造方法被调用了...");
	}
}
public class Example11 { 
	public static void main(String[] args) {
		Person p = new Person(18); // 实例化 Person 对象
	}
}


