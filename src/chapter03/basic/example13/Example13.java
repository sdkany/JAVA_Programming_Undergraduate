package chapter03.basic.example13;
class Person {
	public static void say() { // 定义静态方法
		System.out.println("Hello!");
	}
}
public class Example13 {
	public static void main(String[] args) {
		// “类名.方法”的方式调用静态方法
		Person.say();
		// 实例化对象
		Person person = new Person();
		// “实例对象名.方法”的方式来调用静态方法
		person.say();
	}
}


