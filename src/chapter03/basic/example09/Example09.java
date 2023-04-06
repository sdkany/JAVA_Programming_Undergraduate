package chapter03.basic.example09;
class Person {
	// 声明int类型的变量age
	int age;
	// 定义有参构造方法
	public Person(int a) {
		age = a;                  //为age属性赋值
	}
	// 定义 speak() 方法
	public void speak() {
		System.out.println("我今年" + age + "岁了!");
	}
}
public class Example09 {
	public static void main(String[] args) {
		Person p = new Person(18); // 实例化Person对象
		p.speak();
	}
}


