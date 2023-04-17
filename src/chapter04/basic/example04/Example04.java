package chapter04.basic.example04;
//定义Animal类
class Animal {
	// 定义Animal类有参的构造方法
	public Animal(String name) { 
		System.out.println("我是一只" + name);
	}
}
//定义Dog类继承Animal类
class Dog extends Animal {
	public Dog() {
		super(Dog.class.getSimpleName());          // 调用父类有参的构造方法
	}
}
//定义测试类
public class Example04 {
	public static void main(String[] args) {
		Dog dog = new Dog();   // 创建Dog类的实例对象
	}
}


