package chapter03.basic.example10;
class Person {
	// 声明String类型的变量name
	String name;
	// 声明int类型的变量age
	int age;
	// 定义有参构造方法
	public Person(int a) {
		age = a;                  // 为age属性赋值
	}
	public Person(String n,int a){
		name = n;                // 为name属性赋值
		age = a;                 // 为age属性赋值
	}
	// 定义 speak() 方法
	public void speak() {
		System.out.println("我今年" + age + "岁了!");
	}
	// 定义say()方法
	public void say(){
		System.out.println("我叫"+name+",今年" + age + "岁了!");
	}
}
public class Example10 {
	public static void main(String[] args) {
		Person p1 = new Person(18); 
		Person p2 = new Person("张三",32);
		p1.speak();
		p2.say();
	}
}


